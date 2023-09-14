<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  body, nav, ul, li {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
  }
  a {
    text-decoration: none;
  }
  .gnb {
    padding-top: 50px;
    border-bottom: 1px solid gray;
  }
  .gnb ul {
    list-style-type: none;
    display: flex;
    justify-content: center;
  }
  .gnb li {
    width: 100px;
    height: 50px;
  }
  .gnb a {
    display: block;
    width: 100%;
    height: 100%;
    color: gray;
    text-align: center;
    line-height: 50px;
  }
  ,gnb a:hover {
    color: crimson;
  }
</style>
</head>
<body>

  <nav class="gnb">
    <ul>
      <li><a href="main1.jsp">main1</a></li>
      <li><a href="main2.jsp">main2</a></li>
      <li><a href="main3.jsp">main3</a></li>
    </ul>
  </nav>



</body>
</html>