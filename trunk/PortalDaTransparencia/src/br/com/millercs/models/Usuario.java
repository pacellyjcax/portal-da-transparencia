package br.com.millercs.models;

import java.sql.Date;

import br.com.millercs.dao.FabricaDAO;
import br.com.millercs.dao.interfaces.IUsuarioDAO;
import br.com.millercs.encryption.CriptoMCS;

public class Usuario{
	
	private int idUsuario;
	private String login, senha,permissoes;
	private Date ultimoLogin;
	
	
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = CriptoMCS.encrypt(senha);
	}

	public Usuario() {
		
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int id) {
		this.idUsuario = id;
	}

	public Date getUltimoLogin() {
		return ultimoLogin;
	}

	public void setUltimoLogin(Date ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}

	public String getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(String permissoes) {
		this.permissoes = permissoes;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = CriptoMCS.encrypt(senha);
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	@Override
	public String toString() {
		return getIdUsuario()+" - "+getLogin() +" - "+getSenha();
	}

	public boolean isUsuarioValido() {
		IUsuarioDAO userDAO = FabricaDAO.createUsuarioDAO();
		Usuario usuario = userDAO.getUsuario(this);
		if(usuario == null){
			return false;
		}
		return true;
		
	}

}
