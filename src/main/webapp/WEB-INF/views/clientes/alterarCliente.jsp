<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera��o de Clientes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
	.margem-botao {
		margin-top: 10px;
		margin-bottom: 10px;
	}
	.borda {
		margin: auto;
		max-width: 400px;
	}

</style>
</head>
<body>
	<div class="container borda">
		<h2 class="text-primary text-center">Altera��o de Clientes</h2>
		<form action="/clientes/alterar" method="post">
		
			<div class="mb-3">
				<label class="form-label">CPF:</label>
				<input type="text" name="cpf" class="form-control" value="${cliente.cpf}" maxlength="11" readonly />
			</div>	
			
			<div class="mb-3">
				<label class="form-label">Nome:</label>
				<input type="text" name="nome" class="form-control" value="${cliente.nome}" />
			</div>	
			
			<div class="mb-3">
				<label class="form-label">Email:</label>
				<input type="text" name="email" class="form-control" value="${cliente.email}" />
			</div>	
			
			<div class="mb-3">
				<label class="form-label">Telefone:</label>
				<input type="text" name="telefone" class="form-control" value="${cliente.telefone}" />
			</div>	
			
			
			<button type="submit" class="btn btn-primary">Alterar</button> | 
			<a href="/clientes/lista" class="btn btn-secondary">Voltar para a lista</a>
			
			
			
		</form>
	
	</div>
	
</body>
</html>