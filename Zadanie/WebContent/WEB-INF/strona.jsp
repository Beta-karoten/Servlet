<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dzielniki</title>
</head>
<body>
<h1>Lista dzielnikow:</h1><br>
<c:forEach var="liczba" items="${lista}" >
${liczba}<br> 
</c:forEach>
</body>
</html>