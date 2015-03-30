<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<title>Resolver Prova</title>
</head>

<body>

<div class=container>
	<div class="row">
		<div class="col-md-12">
			<h1>${prova.titulo}</h1>
			<p>${prova.observacao}</p>
		</div>

	</div>
	
	<h3>${mensagem}</h3>
	
	    <c:forEach var="questao" items="${prova.questoes}">
			<b>${questao.enunciado}</b>
			<p>a) ${questao.alternativa1 }</p>
			<p>b) ${questao.alternativa2 }</p>
			<p>c) ${questao.alternativa3 }</p>
			<p>d) ${questao.alternativa4 }</p>
			<br/>
	    </c:forEach>
	
</div>

</body>
</html>