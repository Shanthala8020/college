<%@page import="org.jsp.jesa5.dto.Course"%>
<%@page import="java.util.List"%>
<%@page import="org.jsp.jesa5.dao.CourseDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="Home.css">
</head>
<body>
	<div>
		<h1 style="color: green">${success}</h1>
		<h1 style="color: red">${fail}</h1>
		<h1>College Management System</h1>
	</div>
	<div>
		<div class="container">
			<a href="/AdminLogin.jsp"><button>
					Admin</button></a> <a href="/StudentLogin.jsp"><button>
					 Student</button></a> <a href="/FacultyLogin.jsp"><button>
					 Faculty</button></a> <a href="/StaffLogin.jsp"><button>
					 Staff</button></a>
		</div>

	</div>
</body>
</html>