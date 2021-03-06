<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
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
	
	<h1> <p class="text-success">¡Bienvenido/a!</p> </h1>
	<br>
		<form:form action="/registro/usuario" method="post" modelAttribute="usuario" >
			<form:label path="nombre" class="form-label">Nombre:</form:label>
			<form:input path="nombre" class="form-control"/>
			<br>	
			<form:label path="apellido" class="form-label">Apellido:</form:label>
			<form:input path="apellido" class="form-control"/>
			<br>
			<form:label path="edad" class="form-label">Edad:</form:label>
			<form:input type="number" path="edad" class="form-control"/>
			<br>
			<form:label path="email" class="form-label">Email:</form:label>
			<form:input type="text" path="email" class="form-control"/>
			<br>
			<form:label path="password" class="form-label">Password:</form:label>
			<form:input type="password" path="password" class="form-control"/>
			<br>
			<form:label path="passwordConfirmacion" class="form-label">Confirmar password:</form:label>
			<form:input type="password" path="passwordConfirmacion" class="form-control"/>
			<br>
			<div class="form-check">
      			<input class="form-check-input" type="checkbox" id="gridCheck">
      			<label class="form-check-label" for="gridCheck">
        		 Recuérdame
      			</label>
    		</div>
    	<br>
			<button type="submit" class="btn btn-outline-success">Registrar</button>
		</form:form>
	</div>
</body>
</html>
