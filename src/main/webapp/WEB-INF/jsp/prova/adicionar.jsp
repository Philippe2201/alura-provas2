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
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

<title>Adicionar Prova</title>
</head>

<body>
	<form action=<c:url value='/prova/adicionar'/> method="post">

		<div class=container>

			<h1>Adicionar Prova</h1>

			<hr>

			<h3>Detalhes da Prova:</h3>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<label for="titulo">Título da prova: </label> <input type="text"
							class="form-control" name="titulo" id="titulo">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<label for="descricao">Descrição:</label>
						<textarea class="form-control" name="descricao" id="descricao"
							rows="3"></textarea>
					</div>
				</div>
			</div>

			<hr>
			<div id="questoes">
			<h3>Questões:</h3>
			<br>
			<h4>Questão 1:</h4>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<label for="descricao">Enunciado:</label>
						<textarea class="form-control" name="descricao" id="descricao"
							rows="1"></textarea>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label for="descricao">Alternativa a:</label>
						<textarea class="form-control" name="descricao" id="descricao"
							rows="1"></textarea>
					</div>
				</div>

				<div class="col-md-6">
					<div class="form-group">
						<label for="descricao">Alternativa b:</label>
						<textarea class="form-control" name="descricao" id="descricao"
							rows="1"></textarea>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label for="descricao">Alternativa c:</label>
						<textarea class="form-control" name="descricao" id="descricao"
							rows="1"></textarea>
					</div>
				</div>

				<div class="col-md-6">
					<div class="form-group">
						<label for="descricao">Alternativa d:</label>
						<textarea class="form-control" name="descricao" id="descricao"
							rows="1"></textarea>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-6">
					<div class="form-group">
						<label for="descricao">Alternativa e:</label>
						<textarea class="form-control" name="descricao" id="descricao"
							rows="1"></textarea>
					</div>
				</div>

				<div class="col-md-6">
					<div class="form-group">
						<label for="respostaCorreta">Resposta Correta:</label> <select
							class="form-control" id="respostaCorreta" name="respostaCorreta">
							<option>a</option>
							<option>b</option>
							<option>c</option>
							<option>d</option>
							<option>e</option>
						</select>
					</div>
				</div>
			</div>
			</div>
	</form>

	</div>

</body>
</html>