package br.com.millercs.command.despesas;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import br.com.millercs.command.ICommand;
import br.com.millercs.system.UrlRobot;

public class AbrirDespesasInicialCommand implements ICommand{

	@Override
	public String execute(HttpServletRequest request) throws ServletException{
		
		return UrlRobot.SITE_DESPESAS;
	}

}
