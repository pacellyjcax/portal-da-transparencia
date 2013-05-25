package br.com.millercs.command.despesas;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import br.com.millercs.command.ICommand;

public class AbrirDespesasCommand implements ICommand{

	@Override
	public String execute(HttpServletRequest request) throws ServletException,
			IOException {
		String codEntidade = request.getParameter("e");
		
		return "despesas.jsp?show=true";
	}

}
