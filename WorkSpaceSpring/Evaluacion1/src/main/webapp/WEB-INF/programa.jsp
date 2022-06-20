<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro programa</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<c:if test="${msgError!= null}">
			<c:out value="${msgError }"></c:out>
		</c:if>
	
		<h1><p class="text-primary">¡Bienvenido/a! Ingrese los datos de su programa</p></h1>
		<br>
	
		<form:form action="/programa/registro" method="post" modelAttribute="programa" >
			<form:label path="nombre" class="form-label">Nombre:</form:label>
			<form:input path="nombre" class="form-control"/>
			<br>	
			<form:label path="duracion" class="form-label">Duración:</form:label>
			<form:input path="duracion" class="form-control"/>
			<br>	
			<form:label path="audiencia" class="form-label">Audiencia:</form:label>
			<form:input type="number" path="audiencia" class="form-control"/>
			<br>
		
			<button type="submit" class="btn btn-outline-primary">Registrar
		</form:form>
	</div>
</body>
</html>
