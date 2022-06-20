<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Programa</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

</head>
<body>

<h1> <p class="text-secondary" align="center">Registros de programas</p> </h1>
<br>
<div class= "container">
	<table class="table">
	<thead>
   	 <tr>
     	<th scope="col">#</th>
      	<th scope="col">Nombre</th>
      	<th scope="col">Duracion</th>
      	<th scope="col">Audiencia</th>
      	<th scope="col">Acciones</th>
    </tr>
  </thead>
	 <tbody>
		<c:forEach var="programa" items="${programasRegistrados}">
		<tr>
      		<th scope="row">${programa.id}</th>
      		<td>${programa.nombre}</td>
      		<td>${programa.duracion}</td>
      		<td>${programa.audiencia}</td>
     		<td><a class="btn btn-warning" href="/programa/editar/${programa.id}" role="button">Editar</a></td>
			<td><a class="btn btn-danger" href="/programa/eliminar/${programa.id}" role="button">Eliminar</a></td>
     		
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