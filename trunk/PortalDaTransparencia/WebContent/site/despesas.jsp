<%@page import="br.com.millercs.dao.FabricaDAO"%>
<%@page import="br.com.millercs.dao.interfaces.IEntidadeDAO"%>
<%@page import="br.com.millercs.models.Entidade"%>
<%@page import="br.com.millercs.models.Despesa"%>
<%@page import="br.com.millercs.system.ListSource"%>
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

<link rel="stylesheet" href="../_assets/css/jQuery.css" />


<!-- Mobile Devices Check -->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- jQuery & JS files -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="../_assets/js/script.js"></script>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
<script>
	$(function() {
		$("#accordion").accordion();

	});
</script>
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
						<li><a
							href="controller.do?action=AbrirDespesas&e=<%=e.getId()%>"><%=e.getTituloDaEntidade()%></a></li>
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


						<!-- end content-module-heading -->

						<div class="content-module-heading cf">
							<h3 class="fl"><%=Language.DESPESAS_LIST_ITENS_HEADER%></h3>

							<span class="fr expand-collapse-text"><%=Language.COMMON_CLOSE%></span>
							<span class="fr expand-collapse-text initial-expand"><%=Language.COMMON_OPEN%></span>
						</div>
						<div class="content-module-main">
							<div id="accordion" disable="true">
								<%
									for (Despesa despesa : (ArrayList<Despesa>) ListSource
												.getList("listDespesas")) {
								%>
									<strong><%=despesa.getNumeroDoEmpenho()%> - <%=despesa.getNomeDoCredor()%>
									</strong>
								
								<div>
									<p>
									<ul>
										<li><%="Data Do Empenho: " + despesa.getDataDoEmpenho()%></li>
										<li><%="Tipo Do Empenho: "+despesa.getTipoDoEmpenho()%></li>
										<li><%="Valor Da Despesa: R$ " + despesa.getValorDaDespesa()%></li>
										<li><%="Valor Liquidado: R$ " + despesa.getValorLiquidado()%></li>
										<li><%="Data Da Liquidacao: "
							+ despesa.getDataDaLiquidacao()%></li>
										<li><%="Descricao Da Despesa: "
							+ despesa.getDescricaoDaDespesa()%></li>							 
									</ul>
									</p>
								</div>
								<%
									}
								
									} else {
								%>
								<p class="information-box">
									<strong><%=Language.DESPESAS_INFO_NOT_HAVE_DESPESAS%></strong>
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
				</div>
				</div>


				<jsp:include page="../layouts/footer.jsp" />
			</div>
			<!-- end fullbackground -->
</body>
</html>