<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


<title>Resolver Prova</title>
</head>

<body>
	<form action=<c:url value='/resolucao/adicionar'/> method="post">

		<div class=container>

			<div class="row">
				<div class="col-md-12">
					<h1>${prova.titulo}</h1>
					<p>${prova.observacao}</p>
				</div>
			</div>
			
			E-mail: <input type="text" name="emailAluno" class="form-controll">

			<h3>${mensagem}</h3>

			<c:set var="numeroQuestao" scope="request" value="${1}" />

			<input type="hidden" name="idProva" value="${prova.id}" />

			<c:forEach var="questao" items="${prova.questoes}">

				<b><c:out value="${numeroQuestao}" />. ${questao.enunciado}</b>

				<p>
					<input type="radio" name="respostas[${numeroQuestao}]" value="1" />
					a) ${questao.alternativa1}
				</p>
				<p>
					<input type="radio" name="respostas[${numeroQuestao}]" value="2" />
					b) ${questao.alternativa2}
				</p>
				<p>
					<input type="radio" name="respostas[${numeroQuestao}]" value="3" />
					c) ${questao.alternativa3}
				</p>
				<p>
					<input type="radio" name="respostas[${numeroQuestao}]" value="4" />
					d) ${questao.alternativa4}
				</p>

				<c:set var="numeroQuestao" scope="request"
					value="${numeroQuestao + 1}" />
				<br />
			</c:forEach>

			<button class="btn btn-default" type="submit" value="enviar">Enviar Prova</button>
	</form>

	</div>
</body>
</html>