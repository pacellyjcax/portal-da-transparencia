package br.com.millercs.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.millercs.models.Usuario;
import br.com.millercs.system.Config;
import br.com.millercs.system.DataConnection;

public class UsuarioPersistence {
	
	public void addUsuario(Usuario usuario)throws SQLException{

		DataConnection dataConnection = new DataConnection();
		Connection connection = dataConnection.getConnection();
		
		String sql = "insert into "+Config.getBdName()+".users values ('"+usuario.getLogin()+"','"+usuario.getSenha()+"')";
		
		Statement s = connection.createStatement();
		s.executeUpdate(sql);
		
		connection.close();
		s.close();
	}	

	public Usuario getUsuario(Usuario usuario){
		
		Usuario retorno = null;
		
		try {
			DataConnection dataConnection = new DataConnection();
			Connection connection = dataConnection.getConnection();
			
			
			String sql = "select * from "+Config.getBdName()+".users where login = '"+usuario.getLogin() + "' and password = '"+usuario.getSenha()+"'";
			
				
			ResultSet rs = dataConnection.getResultSet(sql);
			
			
			if(rs.next()){
				String login = rs.getString("login");
				String senha = rs.getString("password");
				retorno = new Usuario(login,senha);
			}
			
			connection.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return retorno;
	}	
}