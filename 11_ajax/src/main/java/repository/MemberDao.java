package repository;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.MemberDto;

public class MemberDao {

  private SqlSessionFactory factory;
  
  private static MemberDao dao = new MemberDao();
  private MemberDao() {
    try {
      String resource = "config/mybatis-config.xml";
      InputStream in = Resources.getResourceAsStream(resource);
      factory = new SqlSessionFactoryBuilder().build(in);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static MemberDao getDao() {
    return dao;
  }
  
  private final String NS = "repository.member.";
  
  public List<MemberDto> memberList() {
    SqlSession ss = factory.openSession();
    List<MemberDto> list = ss.selectList(NS + "memberList");
    ss.close();
    return list;
  }
  
  public int memberCount() {
    SqlSession ss = factory.openSession();
    int count = ss.selectOne(NS + "memberCount");
    ss.close();
    return count;
  }
  
}
