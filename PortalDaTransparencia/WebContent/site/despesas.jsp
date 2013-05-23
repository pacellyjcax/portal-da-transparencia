<%@page import="br.com.millercs.dao.mysql.EntidadeDAO"%>
<%@page import="br.com.millercs.models.Entidade"%>
<%@page import="br.com.millercs.system.Config"%>
<%@page import="br.com.millercs.system.UrlRobot"%>
<%@page import="br.com.millercs.language.Language"%>
<%@page import="java.util.ArrayList"%>


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
<link rel="stylesheet" href="../_assets/css/style.css">

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

				<ul id="tabs" class="fl">
					<li><a href="<%=UrlRobot.SITE_INDEX%>"><%=Language.COMMON_INICIO%></a></li>
					<li><a href="#" class="active-tab despesas-tab"><%=Language.COMMON_DESPESAS%></a></li>
					<li><a href="<%=UrlRobot.SITE_RECEITAS%>"><%=Language.COMMON_RECEITAS%></a></li>
					<li><a href="<%=UrlRobot.SITE_DEMAIS%>"><%=Language.COMMON_DEMAIS_DEMONSTRATIVOS%></a></li>
					<li><a href="<%=UrlRobot.ADMIN%>"><%=Language.COMMON_ADMIN%></a></li>
				</ul>
				<!-- end tabs -->

				<jsp:include page="../layouts/logoFrontEnd.jsp" />
			</div>
		</div>
		<!-- end full-width -->

		<!-- MAIN CONTENT -->
		<div id="content">

			<div class="page-full-width cf">


				<!-- side-menu -->
				<div class="side-menu fl">
				
					<%
										EntidadeDAO ep = new EntidadeDAO();
													ArrayList<Entidade> entidades = ep.listEntidades();
									%>

					<h3><%=Language.INDEX_SIDE_MENU_TITLE%></h3>

					<ul>
						<%if(entidades != null){
							for(int i =0; i< entidades.size(); i++){
								Entidade e = entidades.get(i);%>
								<li><a href="#"><%=e.getTituloDaEntidade() %></a></li>
							<%}
						}%>
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
							<h3 class="fl">Despesas</h3>
							<span class="fr expand-collapse-text">Fechar</span> <span
								class="fr expand-collapse-text initial-expand">Abrir</span>
						</div>
						<!-- end content-module-heading -->


						<div class="content-module-main">Dados das Despesas</div>
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