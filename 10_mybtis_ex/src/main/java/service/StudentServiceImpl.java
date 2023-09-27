package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;
import domain.StudentDto;
import repository.StudentDao;

public class StudentServiceImpl implements StudentService {

  private StudentDao dao = StudentDao.getDao();
  
  @Override
  public ActionForward studentList(HttpServletRequest request) {
    
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("begin", request.getParameter("begin"))
    
    List<StudentDto> studentList = dao.studentList();
    
    return null;
  }
  
}
