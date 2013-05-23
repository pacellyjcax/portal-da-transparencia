package br.com.millercs.dao.interfaces;

import java.sql.SQLException;

import br.com.millercs.models.Usuario;

public interface IUsuarioDAO {
	
	public void addUsuario(Usuario usuario)throws SQLException;

	public Usuario getUsuario(Usuario usuario);	
}