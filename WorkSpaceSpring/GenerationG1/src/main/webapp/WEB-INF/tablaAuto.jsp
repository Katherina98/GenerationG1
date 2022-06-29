<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Auto</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

</head>
<body>

<h1> <p class="text-secondary" align="center">Registros de autos</p> </h1>
<br>
<div class= "container">
	<!-- FORMULARIO DE BUSQUEDA -->
	<c:if test="${msgError!= null}">
 		<div class="alert alert-warning" role="alert"><c:out value="${msgError}"></c:out></div>
 		</c:if>
		<form action="/inventario/buscar" method="post">
			<label for="marca">Marca:</label>
			<input type="text" id="marca" name="marca">
			<input type="submit" class="btn btn-primary" value="Buscar">
		</form>
		<br>
		<!-- ACCESO DIRECTO MEDIANTE HIPERVINCULO PARA CREACION DE AUTO -->
		<a href="/inventario">Crear nuevo auto</a>
	
	<!-- TABLA -->
	<table class="table">
	<thead>
   	 <tr>
     	<th scope="col">#</th>
      	<th scope="col">Marca</th>
      	<th scope="col">Modelo</th>
      	<th scope="col">Velocidad</th>
      	<th scope="col">Color</th>
      	<th scope="col">Acciones</th>
    </tr>
  </thead>
	 <tbody>
		<c:forEach var="auto" items="${autosCapturados}">
		<tr>
      		<th scope="row">${auto.id}</th>
      		<td>${auto.marca}</td>
      		<td>${auto.modelo}</td>
      		<td>${auto.velocidad}</td>
     		<td>${auto.color}</td>
     		<td><a class="btn btn-warning" href="/inventario/editar/${auto.id}" role="button">Editar</a></td>
			<td><a class="btn btn-danger" href="/inventario/eliminar/${auto.id}" role="button">Eliminar</a></td>
     		
	    </tr>
		</c:forEach>
		
  </tbody>
 </table>
</div>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>