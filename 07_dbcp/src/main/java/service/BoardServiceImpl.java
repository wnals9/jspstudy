package service;

import javax.servlet.http.HttpServletRequest;

import common.ActionForward;
import domain.BoardDto;

public class BoardServiceImpl implements BoardService {

  @Override
  public ActionForward register(HttpServletRequest request) {
    
    // 등록할 제목과 내용
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    
    // 제목 + 내용 -> BoardDto 객체
    BoardDto dto = BoardDto.builder()
                      .title(title)
                      .content(content)
                      .build();
    
    System.out.println(dto);
    
    return null;
    
  }

}