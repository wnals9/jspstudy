package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ActionForward;
import service.ArticleService;
import service.ArticleServiceImpl;

/**
 * Servlet implementation class ArticleController
 */
@WebServlet("*.do")
public class ArticleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	// 요청 인코딩(BoardFilter가 수행함) + 응답 타입과 인코딩
    // request.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
    
    // 요청 주소 확인
    String requestURI = request.getRequestURI();
    String contextPath = request.getContextPath();
    String urlMapping = requestURI.substring(contextPath.length());
    
    // 어디로 어떻게 이동할 것인지 알고 있는 ActionForward 객체
    ActionForward af = null;
    
    // BoardService 객체 생성
    ArticleService ArticleService = new ArticleServiceImpl();
	  
    // 요청에 따른 처리
    switch(urlMapping) {
    // 단순 이동 (forward 처리)
    case "/writeArticle.do":
      af = new ActionForward("/write.jsp", false);
      break;
    case "/index.do":
      af = new ActionForward("/index.jsp", false);
      break;  
    // 서비스 처리
    case "/addArticle.do":
      af = ArticleService.register(request);
      break;
    case "/getArticleList.do":
      af = ArticleService.getArticleList(request);
      break;
    case "/getArticleDetail.do":
      af = ArticleService.getArticleByNo(request);
      break;
    case "/editArticle.do":
      af = ArticleService.edit(request);
      break;
    case "/modifyArticle.do":
      af = ArticleService.modify(request);
      break;
    case "/deleteArticle.do":
      af = ArticleService.delete(request);
      break;
    }
    
    
    // 이동
    if(af != null) {
      if(af.isRedirect()) {
        response.sendRedirect(af.getPath());
      } else {
        request.getRequestDispatcher(af.getPath()).forward(request, response);
      }
    }
    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
