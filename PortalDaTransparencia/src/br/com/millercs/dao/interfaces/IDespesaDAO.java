package br.com.millercs.dao.interfaces;

import java.util.ArrayList;

import br.com.millercs.models.Despesa;


public interface IDespesaDAO {
	
	public ArrayList<Despesa> getDespesasFromEntidadeID(int id);
	
}