package service;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public interface MemberService {
  public void getMemberList(HttpServletResponse response) throws IOException;
}
