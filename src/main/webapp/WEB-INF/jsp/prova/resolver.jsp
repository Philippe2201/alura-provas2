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
	
	<script type="text/javascript">
	
	function enviar(){
		 
		
		var email = document.getElementById("txtemail");
		 
		var texto = email; 
		 
		return true;
		 
		}
	
	</script>
	<title>Resolver Prova</title>
</head>

<body>
<form action=<c:url value='/resposta/adicionar'/> method="post">
Nome: <input type="text" name="name">
E-mail: <input type="text" name="idAluno" id="txtemail">
</form>

<div class=container>
	<div class="row">
		<div class="col-md-12">
			<h1>${prova.titulo}</h1>
			<p>${prova.observacao}</p>
		</div>

	</div>
	
	<h3>${mensagem}</h3>
	<form action="<c:url value='/resposta/adicionar'/>" method="post" >
		<c:set var="numeroQuestao" scope="request" value="${1}"/>
		
		<input type="hidden" name="idProva" value="${prova.id}"/>  
		
	    <c:forEach var="questao" items="${prova.questoes}" >
	    
			<b><c:out value="${numeroQuestao}"/>. ${questao.enunciado}</b>
			 
			<p><input type="radio" name="respostas[${numeroQuestao}]" value="1"/> a) ${questao.alternativa1}</p>
			<p><input type="radio" name="respostas[${numeroQuestao}]" value="2"/> b) ${questao.alternativa2}</p>
			<p><input type="radio" name="respostas[${numeroQuestao}]" value="3"/> c) ${questao.alternativa3}</p>
			<p><input type="radio" name="respostas[${numeroQuestao}]" value="4"/> d) ${questao.alternativa4}</p>
			
			<c:set var="numeroQuestao" scope="request" value="${numeroQuestao + 1}"/>
			<br/>
	    </c:forEach>
	    
	    <button type="submit" value="enviar">Enviar Prova</button>
	</form>
	
</div>

</body>
</html>