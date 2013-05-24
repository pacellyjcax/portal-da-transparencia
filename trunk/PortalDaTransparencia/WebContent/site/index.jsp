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
					<jsp:param value="index" name="activePage" />
				</jsp:include>

			</div>
		</div>
		<!-- end full-width -->

		<!-- MAIN CONTENT -->
		<div id="content">

			<div class="page-full-width cf">

				<a href="" id="company-branding-big" class="pc"><img
					src=<%=UrlRobot.SITE_MAIN_BANNER%>
					alt=<%=Config.getFullSystemName()%> /></a>
				<p><%=Language.COMMOM_LEGAL_ADVISER%></p>

			</div>
		</div>
		
		<jsp:include page="../layouts/footer.jsp"/>
	</div>
	<!-- end fullbackground -->
</body>
</html>