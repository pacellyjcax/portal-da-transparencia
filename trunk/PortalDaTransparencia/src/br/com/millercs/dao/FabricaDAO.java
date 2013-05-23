package br.com.millercs.dao;

import br.com.millercs.dao.interfaces.IUsuarioDAO;
import br.com.millercs.dao.mysql.UsuarioDAO;


public class FabricaDAO {
	
	public static IUsuarioDAO createUsuarioDao(){
		return new UsuarioDAO();
	}
	
}