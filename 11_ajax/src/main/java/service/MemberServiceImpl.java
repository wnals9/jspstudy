package service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import domain.MemberDto;
import repository.MemberDao;

public class MemberServiceImpl implements MemberService {
  
  private MemberDao dao = MemberDao.getDao();

  @Override
  public void getMemberList(HttpServletResponse response) throws IOException {
    
    List<MemberDto> memberList = dao.memberList();
    int memberCount = dao.memberCount();
    
    JSONObject obj = new JSONObject();    // { }
    obj.put("memberList", memberList);    // {"memberList": [{}, {}, {}, ... ]}
    obj.put("memberCount", memberCount);  // {"memberList": [{}, {}, {}, ... ], "memberCount":5}
    //                                       ---------------------------------------------------
    //                                                            ↓
    PrintWriter out = response.getWriter();                   //  ↓
    out.println(obj.toString());  // $.ajax({success: function(resData){}})
    //                 ↓                                          ↑
    //                 └------------------------------------------┘
    out.flush();
    out.close();
    
  }

}
