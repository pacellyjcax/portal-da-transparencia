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
import br.com.millercs.command.despesas.AbrirDespesasCommand;
import br.com.millercs.language.Language;

/**
 * Servlet implementation class ServletController
 */

public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, ICommand> map;

	public void init(ServletConfig config) throws ServletException {
		map = new HashMap<String, ICommand>();
		map.put("AbrirDespesas", new AbrirDespesasCommand());
		
		
	}

	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		ICommand command = this.find(action);
		String url = command.execute(request);

		RequestDispatcher d = request.getRequestDispatcher(url);
		d.forward(request, response);
	}

	private ICommand find(String action) throws ServletException {
		// Verifica se foi informada alguma pagina que nao esta mapeada no
		// HashMap
		if (!map.containsKey(action)) {
			throw new ServletException(Language.SYSTEM_PAGE_NOT_FOUND + action );
		}
		return (ICommand) map.get(action);
	}

	protected void serviceOLD(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		

	}

}
