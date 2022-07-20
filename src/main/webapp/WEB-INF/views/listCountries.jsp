<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Countries</title>
</head>
<body>
<h1>Countries</h1>
<c:forEach var="countries" items="${countries}">
	<ul>
	  <li>${countries.name} - ${countries.continent}</li>
	</ul>
</c:forEach>

	<form action="/countries-by-continent" method="POST">
		<h2>Search By Continent:</h2>
		Continent: <input type="text" name="continent"/>
	<input type="submit"/>
	</form>
	
</body>
</html>