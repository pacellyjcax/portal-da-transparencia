package br.com.millercs.command.despesas;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import br.com.millercs.command.ICommand;
import br.com.millercs.dao.FabricaDAO;
import br.com.millercs.dao.interfaces.IDespesaDAO;
import br.com.millercs.models.Despesa;
import br.com.millercs.system.ListSource;
import br.com.millercs.system.UrlRobot;

public class AbrirDespesasCommand implements ICommand {

	@Override
	public String execute(HttpServletRequest request) throws ServletException,
			IOException {

		String retorno = UrlRobot.SITE_DESPESAS;
		String codEntidadeParam = request.getParameter("e");
		int codEntidade = Integer.parseInt(codEntidadeParam);

		IDespesaDAO despesaDAO = FabricaDAO.createDespesaDAO();
		ArrayList<Despesa> listaDespesas = despesaDAO
				.getDespesasFromEntidadeID(codEntidade);
		if (listaDespesas.size() != 0) {

			ListSource.saveList("listDespesas", listaDespesas);
			retorno += "?show=true";

		}

		return retorno;
	}

}
