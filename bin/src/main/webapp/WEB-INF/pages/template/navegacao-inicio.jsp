<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

                
                <!--
                Menu de navegação
                -->
                
				<div class="row-nav navbar">
					<div class="navbar-inner">
						<ul id="nav" class="nav">
							<li class="active selected"><a href="controlador-geral?execute=Voltar">Home</a></li>
							<li class="divider-vertical"></li>							
							
							<li><a href="controlador-geral?execute=ChamaCalculaFrete">Calculo do Frete</a></li>
							<li class="divider-vertical"></li>
							
							<li><a href="controlador-geral?execute=ChamaCadastraCidade">Cadastro de Cidades</a></li>
							<li class="divider-vertical"></li>
							
							<li><a href="controlador-geral?execute=Logout">Logout</a></li>
							<li class="divider-vertical"></li>
							
						</ul>

					</div>
				</div>
               
                <!-- 
                Menu de navegação - Final
                -->
  				
				
				
			</div>
		</div>
	</div>
	</header>
	<div class="text-center">
		<img src="<c:url value="/static/img/sha.png" />" class="slidershadow" alt="">
	</div>
	<!-- 
	HEADER - Final
	-->
    
	