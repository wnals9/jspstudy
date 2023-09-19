<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>

  <div>
    <form method="get" action="${contextPath}/getAge.do">
      <label for=year>태어난년도</label>
      <select name="year" id="year">
        <c:forEach var="y" begin="1970" end="2023" step="1">
          <option>${y}</option>
        </c:forEach>
      </select>
      <button type="submit">몇 살인지 알려주세요</button>
    </form>
  </div>
  
  <hr>
  
  <div>
    <form method="get" action="${contextPath}/getAbs.do">
      <label for="n">숫자입력</label>
      <input type="text" name="n" id="n">
      <button type="submit">절대값요청하기</button>
    </form>
  </div>

  





</body>
</html>