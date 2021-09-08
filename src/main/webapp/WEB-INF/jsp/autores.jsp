<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de autores</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj"
	crossorigin="anonymous"></script>
</head>
<body class="container">

	<div class="py-3 px-md-5 border rounded">
		<form action="<c:url value="/autores"/>" method="POST">
			<h1 class="text-center bg-light">Cadastro de autor</h1>
			<div class="form-group">
				<label for="nome">Nome</label> <input id="nome" class="form-control"
					name="nome">
			</div>
			<div class="form-group">
				<label for="email">Email</label> <input id="email"
					class="form-control" name="email">
			</div>
			<div class="form-group">
				<label for="dataNascimento">Data de Nascimento</label> <input
					id="dataNascimento" class="form-control" name="dataNascimento">
			</div>
			<div class="form-group">
				<label for="miniCurriculo">Mini Curriculo</label> <input
					id="miniCurriculo" class="form-control" name="miniCurriculo">
			</div>

			<input type="submit" value="Gravar"
				class="ml+2 mt-2 mb-2 btn-primary">
		</form>
	</div>

	

	<div class="py-2 px-md-5 border rounded">
		<table class="table table-hover table-striped">
			<h1 class="text-center bg-light">Lista de autores</h1>
			<thead>
				<tr>
					<th>NOME</th>
					<th>EMAIL</th>
					<th>DATA DE NASCIMENTO</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${autores}" var="a">
					<tr>
						<td>${a.nome}</td>
						<td>${a.email}</td>
						<td>${a.dataNascimento}</td>

					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>