<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

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


<script src="<c:url value="/resources/js/clone-form-td.js" />"></script>

<title>Adicionar Prova</title>
</head>

<body>
	<form action=<c:url value='/prova/adicionar'/> method="post">

		<div class="container" style="margin-bottom: 100px">

			<h1>Adicionar Prova</h1>

			<hr>

			<h3>Detalhes da Prova:</h3>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<label for="titulo">Título da prova: </label> 
						<input type="text" class="form-control" name="titulo" id="titulo">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<label for="descricao">Observação:</label>
						<textarea class="form-control" name="observacao" id="observacao" rows="3"></textarea>
					</div>
				</div>
			</div>

			<hr>

			<h3>Questões:</h3>
			<br>
			
			<div id="questao1" class="clonedInput">
				<h4 class="titulo-questao">Questão 1:</h4>
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<label class="label_enunciado control-label" for="questao[0].enunciado">Enunciado:</label>
							<textarea class="txt_enunciado form-control" name="questao[0].enunciado" id="questao[0].enunciado" rows="2"></textarea>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<label class="label_alternativa1 control-label" for="alternativa1">Alternativa a:</label>
							<textarea class="txt_alternativa1 form-control" name="questoes[0].alternativa1" id="questoes[0].alternativa1" rows="1"></textarea>
						</div>
					</div>

					<div class="col-md-6">
						<div class="form-group">
							<label class="label_alternativa2 control-label" for="alternativa2">Alternativa b:</label>
							<textarea class="txt_alternativa2 form-control" name="questoes[0].alternativa2" id="questoes[0].alternativa2" rows="1"></textarea>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<div class="form-group">
							<label class="label_alternativa3 control-label" for="alternativa3">Alternativa c:</label>
							<textarea class="txt_alternativa3 form-control" name="questoes[0].alternativa3" id="questoes[0].alternativa3" rows="1"></textarea>
						</div>
					</div>

					<div class="col-md-6">
						<div class="form-group">
							<label class="label_alternativa4 control-label" for="alternativa4">Alternativa d:</label>
							<textarea class="txt_alternativa4 form-control" name="questoes[0].alternativa4" id="questoes[0].alternativa4" rows="1"></textarea>
						</div>
					</div>
				</div>

				<div class="row">

					<div class="col-md-3">
						<div class="form-group">
							<label class="label_respsotaCorreta" for="respostaCorreta">Resposta Correta:</label> 
							<select class="select_respostaCorreta form-control" id="questoes[0].respostaCorreta" name="questoes[0].respostaCorreta">
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
			
			<div class="row">
					
					<div class="col-md-9">
						<label class="label_respsotaCorreta">Opções:</label><br>
						<button type="button" id="btnAdd" name="btnAdd" class="btn btn-info">Adicionar Questão</button>
						<button type="button" id="btnDel" name="btnDel" class="btn btn-danger" disabled="disabled">Remover Questão</button>
					
					</div>
				
				</div>
	</form>

	</div>

</body>
</html>