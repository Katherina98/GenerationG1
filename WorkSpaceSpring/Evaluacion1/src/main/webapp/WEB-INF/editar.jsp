<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ingresar datos</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>


	<br>
	<div class="container">
	<c:if test="${msgError!= null}">
			<c:out value="${msgError }"></c:out>
		</c:if>

	<h1> <p class="text-primary">Actualización de datos:</p> </h1>
	
		<form:form action="/programa/actualizar/${programa.id}" method="post" modelAttribute="programa" >
			<form:label path="nombre" class="form-label">Nombre:</form:label>
			<form:input path="nombre" class="form-control"/>
			<br>	
			<form:label path="duracion" class="form-label">Duración:</form:label>
			<form:input path="duracion" class="form-control"/>
			<br>	
			<form:label path="audiencia" class="form-label">Audiencia:</form:label>
			<form:input type="number" path="audiencia" class="form-control"/>
			<br>
		
			<button type="submit" class="btn btn-outline-primary">Guardar cambios
		</form:form>
	</div>
</body>
</html>