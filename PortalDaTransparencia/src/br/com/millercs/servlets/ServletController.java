package br.com.millercs.servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.millercs.command.ICommand;
import br.com.millercs.language.Language;

/**
 * Servlet implementation class ServletController
 */

public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, ICommand> map;

	public void init(ServletConfig config) throws ServletException {
		map = new HashMap<String, ICommand>();
		
		
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");

		ICommand command = this.find(acao);
		String url = command.execute(request);

		RequestDispatcher d = request.getRequestDispatcher(url);
		d.forward(request, response);
	}

	private ICommand find(String acao) throws ServletException {
		// Verifica se foi informada alguma pagina que nao esta mapeada no
		// HashMap
		if (!map.containsKey(acao)) {
			throw new ServletException(Language.SYSTEM_PAGE_NOT_FOUND + acao);
		}
		return (ICommand) map.get(acao);
	}

	protected void serviceOLD(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		

	}

}
