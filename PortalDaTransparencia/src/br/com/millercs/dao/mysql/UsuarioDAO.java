package br.com.millercs.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import br.com.millercs.dao.ConnectionPool;
import br.com.millercs.dao.interfaces.IUsuarioDAO;
import br.com.millercs.models.Usuario;

public class UsuarioDAO implements IUsuarioDAO{
	
	private DataSource dataSource = null;
	
	public void addUsuario(Usuario usuario)throws SQLException{

		ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
		dataSource = connectionPool.getDataSource();
		
		Connection connection = dataSource.getConnection();
		
		String sql = "insert into users values (?,?)";
		
		connection.setAutoCommit(false);
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, usuario.getLogin());
		ps.setString(2, usuario.getSenha());
		ps.executeUpdate(sql);
		
		connection.setAutoCommit(true);
		ps.close();
		connection.close();
	}	

	public Usuario getUsuario(Usuario usuario){
		
		Usuario usuarioParaRetorno = null;
		
		try {
			ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
			dataSource = connectionPool.getDataSource();
			
			Connection connection = dataSource.getConnection();
			

			String sql = "select * from users where login = ? and password = ?";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, usuario.getLogin());
			ps.setString(2, usuario.getSenha());
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();		
			
			if(rs.next()){
				String login = rs.getString("login");
				String senha = rs.getString("password");
				usuarioParaRetorno = new Usuario(login,senha);
			}
						
			rs.close();
			ps.close();
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return usuarioParaRetorno;
	}	
}