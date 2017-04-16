<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--
	FOOTER - In�cio
	-->

<!-- Primeira Linha  -->
<div class="footer footerdark">
	<div class="text-center wraptotop">
		<a class="totop">
			<i class="icon-chevron-up"></i>
		</a>
	</div>

	<div class="container">

		<div class="row-fluid">
			<div class="span4">
				<h1 class="title">O Sistema</h1>
				<hr>
					<p>
						O sistema auxilia o usuario no calculo de frete, onde o mesmo pode, com seu usario, cadastrar cidades e consultar seu frete.
					</p>

				</div>
			</div>
		</div>
	</div>

	<!--Segunda linha -->
	<div class="footerbottom footerbottomdark">
		<div class="container">
			<div class="row-fluid">
				<!-- Canto esquerdo -->
				<div class="span4 smallspacetop">
					<p class="smaller">
						<span class="copyright">©
						</span>
						Copyright 2017 Rapidão Fretes
					</p>
				</div>
				<!-- Canto direito -->
				<div class="span8 smallspacetop">
					<div class="pull-right smaller">
						<ul class="footermenu">
							<li>
								<a href="controlador-geral?execute=Voltar">Home</a>
							</li>
							<li>
								<a href="controlador-geral?execute=ChamaCalculaFrete">Calculo do Frete</a>
							</li>
							<li>
								<a href="controlador-geral?execute=ChamaCadastraCidade">Cadastro de Cidades</a>
							</li>
							<li>
								<a href="controlador-geral?execute=Logout">Logout</a>
							</li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>

			</div>
		</div>
	</div>
	<!--
	FOOTER - Final
	-->

</div>

<!--
Arquivos Javascripts

Colocados no final do documento para que as p�ginas sejam carregadas mais
rapidamente
-->
<script src="<c:url value=" /static/js/jquery.js"/>"></script>
<script src="<c:url value=" /static/js/bootstrap.js"/>"></script>
<script src="<c:url value=" /static/js/plugins.js"/>"></script>
<script src="<c:url value=" /static/js/custom.js"/>"></script>

<!-- Chama a opacidade nas imagens do Grupo de trabalho -->
<script type="text/javascript">
	$(document).ready(function () {
		$("img.imgOpa").hover(function () {
			$(this).stop().animate({
				opacity: "0.6"
			}, 'slow');
		}, function () {
			$(this).stop().animate({
				opacity: "1.0"
			}, 'slow');
		});
	});
</script>

</body>
</html>
