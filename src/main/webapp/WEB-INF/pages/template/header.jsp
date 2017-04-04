<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
    <meta charset="utf-8">

	<!--
	P�s-gradua��o em Desenvolvimento de Sistemas Web e Mobile
	Linguagem de Programa��o Web - Java

	Sistema Web criado para realizar as seguintes atividades:
	- Cadastro de Cidades
	- C�lculo do frete entre duas cidades com base em regras de acordo com a dist�ncia entre as mesmas
	-->
    <title>Rapidasso :: Sistema de Cálculo de Frete</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Sistema web para calculo de frete">
    <meta name="author" content="Maria Gabriela, Felipe Dutra">

    <!-- Estilos -->
    <link href="<c:url value="/static/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/static/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/static/css/camera.css" />" rel="stylesheet">
    <link href="<c:url value="/static/css/icons.css" />" rel="stylesheet">

    <!--
    O arquivo abaixo define o configura��o de cores a serem utilizadas
    -->
    <link href="<c:url value="/static/css/skin-blue.css" />" rel="stylesheet">


    <link href="<c:url value="/static/css/bootstrap-responsive.css" />" rel="stylesheet">
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
          <script src="<c:url value="/static/js/html5shiv.js" />"></script>
        <![endif]-->

    <!-- Fav icon -->
    <link rel="shortcut icon" href="<c:url value="/static/img/ico/favicon.png" />">

</head>



<!--
HEADER - In�cio
-->
<body class="boxed">
<div class="body">

	<!-- Navigation -->
	<header>
	<div class="container clearfix">
		<div class="row-fluid">
			<div class="span12">


				<h1 class="brandlogo"><a href="controlador-geral?execute=Voltar"><img src="<c:url value="/static/img/logo_frete_2.png" />" alt="FASTLESMA"></a></h1>


				<div class="topinfo">

					<!-- �cones para rdes sociais -->
					<ul class="social-icons list-soc">
						<li><a href="#"><i class="icon-facebook"></i></a></li>
						<li><a href="#"><i class="icon-twitter"></i></a></li>
						<li><a href="#"><i class="icon-linkedin"></i></a></li>
						<li><a href="#"><i class="icon-google-plus"></i></a></li>
					</ul>
					<div class="infophone">
						<i class="icon-phone"></i> Tel: +55 12 3159-2033
					</div>
					<div class="infoaddress">
						 Rua Dom Bosco, 283 - Lorena
					</div>
				</div>


				<div class="clearfix">
				</div>
