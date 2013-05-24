<%@page import="br.com.millercs.dao.mysql.EntidadeDAO"%>
<%@page import="br.com.millercs.models.Entidade"%>
<%@page import="br.com.millercs.system.Config"%>
<%@page import="br.com.millercs.system.UrlRobot"%>
<%@page import="br.com.millercs.language.Language"%>
<%
	session.invalidate();
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta>
<title><%=Language.INDEX_MAIN_TITLE%></title>

<!-- CSS -->
<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700'
	rel='stylesheet'>
<link rel="stylesheet" href=<%=UrlRobot.SITE_CSS%>>

<!-- Mobile Devices Check -->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- jQuery & JS files -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="../_assets/js/script.js"></script>
</head>
<body>
	<div id="background-full-page">

		<!-- HEADER -->
		<div id="header-with-tabs">

			<div class="page-full-width cf">
				<jsp:include page="<%=UrlRobot.SITE_COMMON_TABS%>">
					<jsp:param value="receitas" name="activePage" />
				</jsp:include>

				<jsp:include page="../layouts/logoFrontEnd.jsp" />

			</div>
		</div>
		<!-- end full-width -->

		<!-- MAIN CONTENT -->
		<div id="content">

			<div class="page-full-width cf">


				<!-- side-menu -->
				<div class="side-menu fl">

					<h3><%=Language.INDEX_SIDE_MENU_TITLE%></h3>

					<ul>
						<li><a href="#">Prefeitura Municipal</a></li>
						<li><a href="#">Câmara de Vereadores</a></li>
						<li><a href="#">Fundo Municipal de Saúde</a></li>
						<li><a href="#">Instituto de Previdência</a></li>
					</ul>
				</div>
				<!-- end side-menu -->


				<div class="side-content fr">

					<form action="#" method="POST" id="search-form" class="fr">
						<fieldset>
							<input type="text" id="search-keyword"
								class="round button dark ic-search image-right" name=""
								placeholder="<%=Language.COMMON_SEARCH%>" /> <input
								type="hidden" value="SUBMIT" />
						</fieldset>
					</form>



					<div class="content-module">


						<div class="content-module-heading cf">
							<h3 class="fl">Receitas</h3>
							<span class="fr expand-collapse-text">Fechar</span> <span
								class="fr expand-collapse-text initial-expand">Abrir</span>
						</div>
						<!-- end content-module-heading -->


						<div class="content-module-main">Dados das Receitas</div>
						<!-- end content-module-main -->

					</div>
					<!-- end content-module -->

				</div>
				<!-- end side-content -->

			</div>
			<!-- end full-width -->

		</div>
		<!-- end content -->



		<jsp:include page="../layouts/footer.jsp" />
	</div>
	<!-- end fullbackground -->

</body>
</html>