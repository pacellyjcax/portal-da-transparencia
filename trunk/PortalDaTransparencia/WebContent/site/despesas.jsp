<%@page import="br.com.millercs.dao.FabricaDAO"%>
<%@page import="br.com.millercs.dao.interfaces.IEntidadeDAO"%>
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
					<jsp:param value="despesas" name="activePage" />
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

					<%
						IEntidadeDAO ep = FabricaDAO.createEntidadeDAO();
									ArrayList<Entidade> entidades = ep.getAllEntidades();
					%>

					<h3><%=Language.INDEX_SIDE_MENU_TITLE%></h3>

					<ul>
						<%
							if (entidades != null) {
								for (int i = 0; i < entidades.size(); i++) {
									Entidade e = entidades.get(i);
						%>
						<li><a href="controller.do?action=AbrirDespesas&e=<%=e.getId()%>"><%=e.getTituloDaEntidade()%></a></li>
						<%
							}
							}
						%>
					</ul>
				</div>
				<!-- end side-menu -->


				<div class="side-content fr">

					<%
						if (request.getParameter("show") != null) {
					%>
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
							<h3 class="fl"><%=Language.COMMON_DESPESAS %></h3>
							<span class="fr expand-collapse-text"><%=Language.COMMON_CLOSE %></span> <span
								class="fr expand-collapse-text initial-expand"><%=Language.COMMON_OPEN %></span>
						</div>
						<!-- end content-module-heading -->


						<div class="content-module-main">Dados das Despesas</div>
						<!-- end content-module-main -->
						<%
							} else {
						%>
						<p class="information-box">
							<strong><%=Language.DESPESAS_INFO_NOT_HAVE_DESPESAS %></strong>
							<%
								}
							%>
						
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