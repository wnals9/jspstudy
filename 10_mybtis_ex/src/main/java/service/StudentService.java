package service;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;

public interface StudentService {
  public ActionForward studentList(HttpServletRequest request);
}
