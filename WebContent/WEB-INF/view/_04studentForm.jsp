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
	<form:form action="processForm" method="GET" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br />
		<br />
		Last Name: <form:input path="lastName" />
		<br />
		<br />

		Country: 
		<form:select path="country">
			<form:option value="Brazil" />
			<form:option value="Germany" />
			<form:option value="France" />
			<form:option value="Turkey" />
			<form:option value="USA" />
		</form:select>
		<br />
		<br />
		
		Gender: 
		<form:select path="gender">
			<form:options items="${student.genderList }" />
		</form:select>
		<br />
		<br />
		
		Favorite Programming Languages
		Java <form:radiobutton path="programmingLang" value="Java" />
		C#   <form:radiobutton path="programmingLang" value="C#" />
		PHP <form:radiobutton path="programmingLang" value="PHP" />
		C++ <form:radiobutton path="programmingLang" value="C++" />
		<br />
		<br />
		
		Which Operating Systems Do You Have Experience with
		Linux <form:checkbox path="operatingSystems" value="Linux"/> 
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/> 
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		<br />
		<br />

		<input type="submit" value="Submit">
	</form:form>
</body>
</html>