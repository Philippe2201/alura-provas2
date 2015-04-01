<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<title>Resultado</title>
</head>

<body>


	<div class=container>
		<h1>Resultado da prova:</h1>
		<h2>Você acertou ${resolucao.totaldeAcertos} de ${resolucao.numeroDeQuestoes }</h2>
		<c:if test="${resolucao.nota < 5}">
		<span><h2>Sua nota é: <div style="color: red; display:inline-block;">${resolucao.nota }</div></h2></span>
		</c:if>
		<c:if test="${resolucao.nota >= 5}">
		<span><h2>Sua nota é: <div style="color: green; display:inline-block">${resolucao.nota }</div></h2></span>
		</c:if>
	</div>

</body>
</html>