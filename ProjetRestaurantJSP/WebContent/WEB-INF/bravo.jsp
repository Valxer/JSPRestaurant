<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Restaurant | Order Completed</title>
</head>
<body>
	<%@ include file="../header.jsp" %>
	<h1>Order Completed</h1>
	<p>Num�ro de commande :
	<%= session.getAttribute("p")%>
	</p>
	
	<%@ include file="../footer.jsp" %>
</body>
</html>