<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="student" action="processForm">
		First Name <form:input path="firstName"/>
		<br><br>
		Last Name <form:input path="lastName"/>
		<br><br>
		Course Code <form:input path="courseCode"/>
		<form:errors cssStyle="color:red;" path="courseCode"/>
		<br><br>
		
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>