<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<c:if test="${msgError!= null}">
			<div class="alert alert-warning" role="alert"><c:out value="${msgError }"></c:out>
		</div>
		</c:if>	
	
	<h1> <p class="text-success">Login</p> </h1>
	<br>
		<form action="/registro/usuario/ingreso" method="post">
			<label for="email">Email:</label>
			<input type="email" name="email"/>
			<br>
			<label for="password">Password:</label>
			<input type="password" name="password"/>
			<br>
			<input type="submit" value="Ingresar">
		</form>
	</div>
</body>
</html>
