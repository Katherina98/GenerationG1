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
	<c:if test="${msgIngresoError!= null}">
			<c:out value="${msgIngresoError }"></c:out>
		</c:if>

	<h1> <p class="text-primary">Actualización de datos:</p> </h1>
	<form:form action="/inventario/actualizar/${auto.id}" method="post" modelAttribute="auto" >
			<form:label path="color" class="form-label">Color:</form:label>
			<form:input path="color" class="form-control"/>
			<br>	
			<form:label path="modelo" class="form-label">Modelo:</form:label>
			<form:input path="modelo" class="form-control"/>
			<br>	
			<form:label path="marca" class="form-label">Marca:</form:label>
			<form:input path="marca" class="form-control"/>
			<br>
			<form:label path="velocidad" class="form-label">Velocidad:</form:label>
			<form:input type="number" path="velocidad" class="form-control"/>
			<br>
			<button type="submit" class="btn btn-outline-primary">Guardar cambios
		</form:form>
	</div>
</body>
</html>