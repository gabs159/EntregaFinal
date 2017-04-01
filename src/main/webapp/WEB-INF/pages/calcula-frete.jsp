<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:import url="../pages/template/header.jsp" />
<c:import url="../pages/template/navegacao-calcula-frete.jsp" />




<!-- Corpo da página - Inicio -->
<div class="container">


 		<c:import url="../pages/template/painel-informativo-trabalho.jsp" />




  

	<!-- Painel com informações sobre o sistema, tecnologias e ferramentas utilizadas no desenvolvimento e disponibilização do sistema -->
	<div class="row-fluid top25">
		<div class="panel1">
			<div class="span12">


					<form action="controlador-geral?execute=CalculaFrete" method="post">
			
						<div class="form-group">
							<select name="geocodigoA" class="span12 form-control" required>
								<option class="span12" disabled="disabled" selected="selected" value="">Escolha cidade A</option>
								<c:forEach var="a" items="${citiesA}">
									<option  class="span12" value="${a.geocodigo}">${a.nome}</option>
								</c:forEach>
							</select>
						</div>
			
						<div class="form-group">
							<select name="geocodigoB" class="span12 form-control" required>
								<option  class="span12" disabled="disabled" selected="selected" value="">Escolha a cidade B</option>
								<c:forEach var="b" items="${citiesB}">
									<option  class="span12" value="${b.geocodigo}">${b.nome}</option>
								</c:forEach>
			
							</select>
						</div>
			
						<div class="form-group">
							<input type="submit" value="Calcular Frete entre as Cidades" class="btn btn-success" />
						</div>
					</form>


			</div>
			<div class="clearfix"></div>
		</div>
	</div>
    
    
    
    
    <hr>
    <br>
    
    
    
			

		<div class="row-fluid">

				<div class="span12">
					
					<h3 class="top0">Resultado do cálculo do frete</h3>
					<br>		
					
				
			
					<div class="table-responsive">
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Cidade A</th>
									<th>Cidade B</th>
									<th>Distancia (KM)</th>
									<th>Valor do Frete</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="f" items="${frete}">
									<tr>
										<td>${f.pontoA}</td>
										<td>${f.pontoB}</td>
										<td>${f.distancia}</td>
										<td>R$ <fmt:formatNumber value="${f.valorFrete}"
												pattern="#,##0.00" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<hr>


				</div>

		</div>
	

	
</div>
<!-- Corpo da página - Final -->
	
	


<c:import url="../pages/template/footer.jsp" />