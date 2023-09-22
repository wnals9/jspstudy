package repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.StudentDto;

public class StudentDao {

  private SqlSessionFactory factory;
  
  private static StudentDao dao = new StudentDao();
  private StudentDao() {
    
    try {
      String resource = "config/config.xml";
      InputStream in = Resources.getResourceAsStream(resource);
      factory = new SqlSessionFactoryBuilder().build(in);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static StudentDao getDao() {
    return dao;
  }
  
  private final String NS = "mapper.student.";
  
  // 전체 개수 반환 메소드
  public int studentCount() {
    SqlSession ss = factory.openSession();
    int count = ss.selectOne(NS + "studentCount");
    ss.close();
    return count;
  }
  
  // 목록 반환 메소드
  public List<StudentDto> studentList(Map<String, Object> map){
    SqlSession ss = factory.openSession();
    List<StudentDto> list = ss.selectList(NS + "studentList", map);
    ss.close();
    return list;
  }
  
  
  
  
  
  
  
  
  
  
}
