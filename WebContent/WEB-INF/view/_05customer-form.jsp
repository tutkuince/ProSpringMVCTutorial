<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Customer Form</title>
		<style type="text/css">
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
		<form:form modelAttribute="customer" action="processForm">
			First Name   <form:input path="firstName"
				placeholder="What's your name?" />
			<br>
			<br>
			Last Name(*) <form:input path="lastName"
				placeholder="What's your surname?" />
			<form:errors path="lastName" cssClass="error" />
			<br>
			<br>
			
			Free Passes <form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error" />
			<br>
			<br>
	
			Postal Code <form:input path="postalCode" />
			<form:errors path="postalCode" cssClass="error" />
			<br>
			<br>
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>