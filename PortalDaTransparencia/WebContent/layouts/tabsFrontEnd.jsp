<%@page import="br.com.millercs.system.UrlRobot"%>
<%@page import="br.com.millercs.language.Language"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		String activeTab = request.getParameter("activePage");
		if (activeTab != null) {
	%>
	<ul id="tabs" class="fl">

		<%
			if (activeTab.equals("index")) {
		%>

		<li><a href="#" class="active-tab"><%=Language.COMMON_INICIO%></a></li>

		<%
			} else {
		%>
		<li><a href="<%=UrlRobot.SITE_INDEX%>"><%=Language.COMMON_INICIO%></a></li>
		<%
			}
		%>
		<%
			if (activeTab.equals("despesas")) {
		%>
		<li><a href="#" class="active-tab despesas-tab"><%=Language.COMMON_DESPESAS%></a></li>

		<%
			} else {
		%>
		<li><a href="<%=UrlRobot.SITE_DESPESAS%>"><%=Language.COMMON_DESPESAS%></a></li>
		<%
			}
		%>
		<%
			if (activeTab.equals("receitas")) {
		%>
		<li><a href="#" class="active-tab receitas-tab"><%=Language.COMMON_RECEITAS%></a></li>

		<%
			} else {
		%>
		<li><a href="<%=UrlRobot.SITE_RECEITAS%>"><%=Language.COMMON_RECEITAS%></a></li>
		<%
			}
		%>
		<%
			if (activeTab.equals("demais")) {
		%>
		<li><a href="#" class="active-tab demais-tab"><%=Language.COMMON_DEMAIS_DEMONSTRATIVOS%></a></li>

		<%
			} else {
		%>
		<li><a href="<%=UrlRobot.SITE_DEMAIS%>"><%=Language.COMMON_DEMAIS_DEMONSTRATIVOS%></a></li>
		<%
			}
		%>
		<li><a href="<%=UrlRobot.SITE_ADMIN%>"><%=Language.COMMON_ADMIN%></a></li>
	</ul>
	<%
		}
		response.flushBuffer();
	%>
	<!-- end tabs -->

</body>
</html>