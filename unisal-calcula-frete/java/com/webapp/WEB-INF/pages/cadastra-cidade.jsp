<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../pages/template/header.jsp" />
<c:import url="../pages/template/navegacao-cadastra-cidade.jsp" />


	
	
    <!-- Corpo da página - Inicio -->
	<div class="container">
		

	   <c:import url="../pages/template/painel-informativo-trabalho.jsp" />


		<div class="row-fluid top25">
			<div class="panel1">
				<div class="span12">
													

					<form action="controlador-geral?execute=CadastraCidade" method="post">
						<div class="form-group">
							<input type="text" placeholder="Nome da cidade" name="nome"
								class="form-control span12" required="required" />
						</div>
						<div class="form-group">
							<input type="text" placeholder="Geocodigo da Cidade" name="geocodigo"
								class="form-control span12" required="required" />
						</div>
						<div class="form-group">
							<input type="text" placeholder="latitude" name="latitude"
								class="form-control span12" required="required" />
						</div>
						<div class="form-group">
							<input type="text" placeholder="longitude" name="longitude"
								class="form-control span12" required="required" />
						</div>
						<button type="submit" class="btn btn-success">Salvar</button>
					</form>
				
				</div>
				<div class="clearfix">
				</div>
			</div>
			
		</div>
				
				
				
				
		<hr><hr>		

		<div class="row-fluid">
				
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>#</th>
								<th>Nome</th>
								<th>Geocodigo</th>
								<th>Latitude</th>
								<th>Longitude</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="c" items="${cities}">
								<tr id="city_${c.id}">
									<td>${c.id}</td>
									<td>${c.nome}</td>
									<td>${c.geocodigo}</td>
									<td>${c.latitude}</td>
									<td>${c.longitude}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<form class="form-group"
						action="controlador-geral?execute=CarregaTabelaCidades"
						method="post">
						<button type="submit" class="btn btn-default">Ver Cidades Cadastradas</button>
					</form>
				</div>
		
		</div>
		
		
		
		
	</div>
	<!-- Corpo da página - Final -->
 



<c:import url="../pages/template/footer.jsp" />