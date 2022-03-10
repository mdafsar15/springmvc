<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Genx</h1>

	<%
	String name = (String) request.getAttribute("name");
	String mobile = (String) request.getAttribute("mobile");

	List<String> list = (List<String>) request.getAttribute("l");
	%>
	
	<h1>Name <%=name %></h1>
	<h1>Mobile Num is <%=mobile %></h1>
	
	<h1><%for(String s:list){ %></h1>
	<h1><%=s %></h1>
	<h1><%} %></h1>

</body>
</html>