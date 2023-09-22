package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;
import domain.StudentDto;
import repository.StudentDao;

public class StudentServiceImpl implements StudentService {

  private StudentDao dao = StudentDao.getDao();
  
  @Override
  public ActionForward studentList(HttpServletRequest request) {
    
    List<StudentDto> studentList = dao.studentList(null)
    
    return null;
  }
  
}
