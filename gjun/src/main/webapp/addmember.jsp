<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<link href="st.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="title"><jsp:include page="title.jsp"/></div>
<div id="content">
<div id="con1">
<form action="addmemberController" method="post">
                 Name:<input type="text" name="name"><br>
                 Username:<input type="text" name="username"><br>
                 Password:<input type="password" name="password"><br>
              <input type="submit" value="ok">
</form>
		
</div>
</div>
<div id="end"><jsp:include page="end.jsp"/></div>
</body>
</html>