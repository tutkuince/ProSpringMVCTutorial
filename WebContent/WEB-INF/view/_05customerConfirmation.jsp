<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<h1>Welcome to world of Spring</h1>
	<p>The customer is confirmed: <b>${customer.firstName }  ${customer.lastName }</b></p>
	<p>Number of Free Passes: <b>${customer.freePasses }</b></p>
	<p>Postal Code: <b>${customer.postalCode }</b></p>
</body>
</html>