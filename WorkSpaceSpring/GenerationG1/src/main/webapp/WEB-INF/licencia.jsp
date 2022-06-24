<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>        
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Licencia</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

	<h1> <p class="text-primary">¡Bienvenido/a! Ingrese los datos de su licencia</p> </h1>
	<br>

	<form:form action="/licencia/guardar" method="post" modelAttribute="licencia" >
			<form:label path="numero" class="form-label">Numero:</form:label>
			<form:input type="number" path="numero" class="form-control"/>
			<br>	
			<form:label path="fechaVencimiento" class="form-label">Fecha de vencimiento:</form:label>
			<form:input type="date" path="fechaVencimiento" min="2018-01-01" max="2030-01-01" class="form-control"/>
			<br>	
			<form:label path="clase" class="form-label">Clase:</form:label>
			<form:input type="text" path="clase" class="form-control"/>
			<br>
			<form:label path="estado" class="form-label">Estado:</form:label>
			<form:input type="text" path="estado" class="form-control"/>
			<br>
			<!-- USUARIO -->
			
			<form:select path="usuario" class="form-select">
				<form:option value="0">Seleccione un usuario:</form:option>
						<c:forEach  var="usuario" items="${listaUsuarios}">
							<c:if test="${usuario.licencia.id == null}">
								<form:option value="${usuario.id}">${usuario.nombre} ${usuario.apellido }</form:option>
							</c:if>
						</c:forEach>				
			</form:select>
			<br>
			<button type="submit" class="btn btn-outline-primary">Registrar licencia</button>
		</form:form>
			<br>
			<br>		
			<h1> <p class="text-secondary" align="center">Registro de licencias</p> </h1>
			
		<div class= "container">
	<table class="table">
	<thead>
   	 <tr>
     	<th scope="col">#</th>
      	<th scope="col">Numero</th>
      	<th scope="col">Fecha de Vencimiento</th>
      	<th scope="col">Clase</th>
      	<th scope="col">Estado</th>
      	<th scope="col">Usuario</th>
      	<th scope="col">Acciones</th>
    </tr>
  </thead>
	 <tbody>
		<c:forEach var="licencia" items="${listaLicencias}">
		<tr>
      		<th scope="row">${licencia.id}</th>
      		<td>${licencia.numero}</td>
      		<td>${licencia.fechaVencimiento}</td>
      		<td>${licencia.clase}</td>
      		<td>${licencia.estado}</td>
     		<td>${licencia.usuario.nombre} ${licencia.usuario.apellido}</td>  <!-- LAZY -->
     		
     		<td><a class="btn btn-warning" href="/licencia/editar/${licencia.id}" role="button">Editar</a></td>
			<td><a class="btn btn-danger" href="/licencia/eliminar/${licencia.id}" role="button">Eliminar</a></td>
     		
	    </tr>
		</c:forEach>
		
  </tbody>
 </table>	
			
			
			
		
	</div>
</body>
</html>