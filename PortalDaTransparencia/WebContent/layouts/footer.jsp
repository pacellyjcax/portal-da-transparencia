<%@page import="br.com.millercs.language.Language"%>
<%@page import="br.com.millercs.system.Config"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<!-- FOOTER -->
	<div id="footer">


		<p>
			<a href="<%=Config.getFullCompanySite()%>"
				id="company-branding-footer" class="pc cf"><img
				src="../_assets/images/MCS-logo-Footer.png"
				alt=<%=Config.getShortCompanyName()%> /></a>
			<a href="<%=Config.getFullCompanySite()%>"><%=Config.getFullCompanyName()%></a>
		</p>

		<p>
			<strong>&copy; Copyright</strong><%=" - "+Language.SYSTEM_ALL_RIGHTS_RESERVED%>
		</p>


	</div>
	<!-- end footer -->
</body>
</html>