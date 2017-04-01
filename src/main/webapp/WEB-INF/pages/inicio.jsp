<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="../pages/template/header.jsp" />
<c:import url="../pages/template/navegacao-inicio.jsp" />




<!-- Corpo da página - Inicio -->
<div class="container">


	<c:import url="../pages/template/painel-informativo-trabalho.jsp" />

	<!-- Titulo informando sobre as funcionalidades do sistema e a posterior descrição das mesmas -->
	<div class="row-fluid text-center intro">
		<div class="span12">
			<h1>
				Introdução ao Sistema <span class="primarycolor">FastLesma</span>, e
				suas facilidades
			</h1>
			<p class="featured lead bottom10">Este sistema tem por objetivo
				facilitar o Cálculo de frete entre duas cidades e também permitir o
				Cadastramento de novas cidades. Abaixo seguem descrições das
				funcionalidades existentes.</p>
		</div>
	</div>


	<!-- Breve descrição das funcionalidades do sistema - Início -->
	<div class="row-fluid graysection">
		<div class="span3">
			<div class="grey-box-icon">
				<div class="icon-box-top grey-box-icon-pos">
					<i class="fontawesome-icon medium circle-white center icon-home"></i>
				</div>
				<h4>Página Inicial</h4>
				<p>Página inicial após realizar login no sistema. Apresenta
					detalhes de todas as funcionalidades do sistema.</p>
				<p>
					<a href="controlador-geral?execute=Voltar"
						style="font-weight: bold;">Acesse aqui</a>
				</p>
			</div>
			<!-- grey box -->
		</div>
		<!-- span3 -->

		<div class="span3">
			<div class="grey-box-icon">
				<div class="icon-box-top grey-box-icon-pos">
					<i class="fontawesome-icon medium circle-white center icon-truck"></i>
				</div>
				<!--icon box top -->
				<h4>Cálculo de Frete</h4>
				<p>Modelo simples para cáculo de Frete com regras internas
					fixas. É esperado a entrada do geocódigo das cidades A e B.</p>
				<p>
					<a href="controlador-geral?execute=ChamaCalculaFrete"
						style="font-weight: bold;">Acesse aqui</a>
				</p>
			</div>
			<!--grey box -->
		</div>
		<!-- span3 -->

		<div class="span3">
			<div class="grey-box-icon">
				<div class="icon-box-top grey-box-icon-pos">
					<i class="fontawesome-icon medium circle-white center icon-pencil"></i>
				</div>

				<h4>Cadastro de Cidades</h4>
				<p>Permite o cadastro de cidades e é obrigatório entrar um o
					valor para nome, geocodigo, latitude e longitude da Cidade.</p>
				<p>
					<a href="controlador-geral?execute=ChamaCadastraCidade"
						style="font-weight: bold;">Acesse aqui</a>
				</p>
			</div>
			<!--grey box -->
		</div>
		<!-- span3 -->


		<div class="span3">
			<div class="grey-box-icon">
				<div class="icon-box-top grey-box-icon-pos">
					<i class="fontawesome-icon medium circle-white center icon-signout"></i>
				</div>

				<h4>Logout</h4>
				<p>Esta funcionalidade permite realizar logout do sistema,
					finalizando a sessão do usuário com segurança.</p>
				<p>
					<a href="controlador-geral?execute=Logout"
						style="font-weight: bold;">Acesse aqui</a>
				</p>
			</div>
			<!--grey box -->
		</div>
		<!-- span3-->
	</div>
	<!-- Breve descrição das funcionalidades do sistema - Final -->




	<!-- Grupo de Trabalho - Título-->
	<div class="row-fluid">
		<div class="span12">
			<div class="titleborder">
				<div>Grupo de Trabalho</div>
			</div>
		</div>
	</div>

	<!-- Grupo de Trabalho -Foto, nome e breve resumo sobre o aluno -->
	<div class="row-fluid recent-posts">
		<div class="span3">
			<article>
				<img src="<c:url value="/static/img/douglas.jpg" />" alt=""
					class="imgOpa">

				<h4>
					<a href="#">Douglas Nunes</a>
				</h4>
				<p>Analista de Sistemas e Empreendedor. Possui sólidos
					conhecimentos em várias linguagens de programação. Formado no
					Centro Salesiano de São Paulo, Unidade de Lorena.</p>
			</article>
		</div>
		<div class="span3">
			<img src="<c:url value="/static/img/fernando.jpg" />" alt=""
				class="imgOpa">
			<article>

				<h4>
					<a href="#">Fernando Esméria</a>
				</h4>
				<p>Engenheiro de Software, especializado em Java e seus diversos
					Frameworks e padrões de projetos. Formado no Centro Salesiano de
					São Paulo, Unidade de Lorena.</p>
			</article>
		</div>
		<div class="span3">
			<img src="<c:url value="/static/img/leonardo.jpg" />" alt=""
				class="imgOpa">
			<article>

				<h4>
					<a href="#">Leonardo Ramos</a>
				</h4>
				<p>Engenheiro de Sistemas especializado em Python. Prossui
					sólidos conehcimentos no Framework Flask. Formado na Faculdade de
					Tecologia, unidade de Cruzeiro.</p>
			</article>
		</div>
		<div class="span3">
			<article>
				<img src="<c:url value="/static/img/renato.jpg" />" alt=""
					class="imgOpa">
				<h4>
					<a href="#">José Renato Nunes</a>
				</h4>
				<p>Analista de Sistemas. Possui sólidos conhecimentos em várias
					linguagens de programação. Formado no Centro Salesiano de São
					Paulo, Unidade de Lorena.</p>
			</article>
		</div>
	</div>



</div>






<c:import url="../pages/template/footer.jsp" />