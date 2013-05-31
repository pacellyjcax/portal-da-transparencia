<%@page import="br.com.millercs.system.SystemVariables"%>
<%@page import="br.com.millercs.system.Config"%>
<%@page import="br.com.millercs.system.UrlRobot"%>
<%
	session.invalidate();
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta>
<title><%=SystemVariables.LOGIN_HEADER_TITLE%></title>



<!-- CSS -->
<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700'
	rel='stylesheet'>
<link rel="stylesheet" href="../_assets/css/style.css">

<!-- Mobile Devices Check -->
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>

	<!-- TOP BAR -->
	<div id="top-bar">

		<div class="page-full-width">

			<a href="../site/<%=UrlRobot.SITE_INDEX%>"
				class="round button dark ic-left-arrow image-left "><%=SystemVariables.LOGIN_RETURN_TO_SITE%></a>
			<a href="#" id="company-branding-small" class="fr"><img
				src=<%=Config.getLogoAdmin()%> alt=<%=Config.getCOMMON_COMPANY_SHORT_NAME()%> /></a>
		</div>
		<!-- end full-width -->

	</div>
	<!-- end top-bar -->


	<!-- HEADER -->
	<div id="header" align="center">

		<div class="page-full-width cf">

			<div id="login-intro" class="fl">

				<h1><%=SystemVariables.LOGIN_HEADER_TITLE%></h1>
				<h5><%=SystemVariables.LOGIN_HEADER_DESCRIPTION%></h5>

			</div>



		</div>
		<!-- end full-width -->

	</div>
	<!-- end header -->




	<!-- MAIN CONTENT -->
	<div id="content">

		<form action="root.jsp" method="POST" id="login-form">

			<fieldset>

				<p>
					<label for="login-username"><%=SystemVariables.LOGIN_USERNAME_TITLE%></label>
					<input type="text" id="login-username" name="username"
						class="round full-width-input" />
				</p>

				<p>
					<label for="login-password"><%=SystemVariables.LOGIN_PASSWORD_TITLE%></label>
					<input type="password" id="login-password" name="password"
						class="round full-width-input" />
				</p>

				<p align="right">Fazer Esquecimento de Senha .</p>
				<%
					if (true) {
				%>
				<p class="error-box">
					<strong>FAZER ALERTA DE ERROS</strong>
				</p>
				<%
					}
				%>

				<input type="submit" id="submit-button"
					class="button round blue image-right ic-right-arrow"
					value=<%=SystemVariables.LOGIN_BUTTON%> />

			</fieldset>

			<br />
			<div class="information-box round"><%=SystemVariables.LOGIN_HELP_BOX%></div>

		</form>

	</div>
	<!-- end content -->



	<jsp:include page="../layouts/footer.jsp" />

</body>
</html>