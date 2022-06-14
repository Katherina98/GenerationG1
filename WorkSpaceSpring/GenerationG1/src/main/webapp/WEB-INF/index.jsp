<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Katherina Scarlett Orellana Silva</title>
</head>
<body>
 	<h1>Bienvenido/a <c:out value="${nombres}"></c:out> <c:out value="${apellidos}"></c:out></h1>
 	<br>
 	<p>El usuario 1 es <c:out value="${usuario.toString()}"></c:out>   </p>
 	<!-- Otra forma de capturar la informacion-->
 	<!--<p><c:out value="${usuario.nombre } ${usuario.apellido } ${usuario.edad }"></c:out>-->
 	<!--<p><c:out value="${edad}"></c:out></p>-->
</body>
</html>