<%@page import="br.com.millercs.system.UrlRobot"%>
<%@page import="br.com.millercs.dao.mysql.EntidadeDAO"%>
<%@page import="br.com.millercs.models.Entidade"%>
<%@page import="br.com.millercs.system.Config"%>
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
<link rel="stylesheet" href=<%=UrlRobot.INDEX_CSS_ROUTE%>>

<!-- Mobile Devices Check -->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />

<!-- jQuery & JS files -->
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<script src="_assets/js/script.js"></script>
</head>
<body>
	<div id="background-full-page">
		<!-- HEADER -->
		<div id="header-with-tabs">

			<div class="page-full-width cf">
				<ul id="tabs" class="fl">
					<li><a href="#" class="active-tab"><%=Language.COMMON_INICIO%></a></li>
					<li><a href="site/despesas.jsp"><%=Language.COMMON_DESPESAS%></a></li>
					<li><a href="site/receitas.jsp"><%=Language.COMMON_RECEITAS%></a></li>
					<li><a href="site/demaisDemonstrativos.jsp"><%=Language.COMMON_DEMAIS_DEMONSTRATIVOS%></a></li>
					<li><a href="admin/root.jsp"><%=Language.COMMON_ADMIN%></a></li>
				</ul>
				<!-- end tabs -->

			</div>
		</div>
		<!-- end full-width -->

		<!-- MAIN CONTENT -->
		<div id="content">

			<div class="page-full-width cf">

				<a href="" id="company-branding-big" class="pc"><img
					src=<%=UrlRobot.INDEX_MAIN_BANNER_ROUTE%>
					alt=<%=Config.getFullSystemName()%> /></a>
				<p><%=Language.COMMOM_LEGAL_ADVISER%></p>

			</div>
		</div>


		<!-- FOOTER -->
		<div id="footer">


			<p>
				<a href="<%=Config.getFullCompanySite()%>"
					id="company-branding-footer" class="pc cf"><img
					src="_assets/images/MCS-logo-Footer.png"
					alt=<%=Config.getShortCompanyName()%> /></a> <a
					href="<%=Config.getFullCompanySite()%>"><%=Config.getFullCompanyName()%></a>
			</p>

			<p>
				<strong>&copy; Copyright</strong><%=" - " + Language.SYSTEM_ALL_RIGHTS_RESERVED%>
			</p>


		</div>
		<!-- end footer -->
	</div>
	<!-- end fullbackground -->
</body>
</html>