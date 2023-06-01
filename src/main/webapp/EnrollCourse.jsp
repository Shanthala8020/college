<%@page import="org.jsp.jesa5.dto.Stream"%>
<%@page import="org.jsp.jesa5.dto.Course"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enroll Course</title>
</head>
<body>
	<%
	List<Course> list = (List<Course>) request.getAttribute("list");
	%>
	<h1>Select Course and Stream</h1>
	<select name="course">
		<%
		for (Course course : list) {
		%>
		<option><%=course.getName()%>
			<%
			}
			%>
		
	</select>
	<select name="stream">
		<%
		for (Course course : list) {
			for (Stream stream : course.getStreams()) {
		%>
		<option><%=stream.getName()%>
			<%
			}
			}
			%>
		
	</select>
</body>
</html>