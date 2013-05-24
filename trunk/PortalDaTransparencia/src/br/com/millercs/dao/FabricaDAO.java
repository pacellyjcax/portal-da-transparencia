package br.com.millercs.dao;

import br.com.millercs.dao.interfaces.IEntidadeDAO;
import br.com.millercs.dao.interfaces.IUsuarioDAO;
import br.com.millercs.dao.mysql.EntidadeDAO;
import br.com.millercs.dao.mysql.UsuarioDAO;


public class FabricaDAO {
	
	public static IUsuarioDAO createUsuarioDAO(){
		return new UsuarioDAO();
	}
	
	public static IEntidadeDAO createEntidadeDAO(){
		return new EntidadeDAO();
	}
	
}