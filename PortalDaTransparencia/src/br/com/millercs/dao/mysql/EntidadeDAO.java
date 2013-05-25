package br.com.millercs.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import br.com.millercs.dao.ConnectionPool;
import br.com.millercs.dao.interfaces.IEntidadeDAO;
import br.com.millercs.models.Entidade;

public class EntidadeDAO implements IEntidadeDAO {

	private DataSource dataSource = null;
	
	public void addEntidade(Entidade entidade) throws SQLException {
		ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
		dataSource = connectionPool.getDataSource();
		
		Connection connection = dataSource.getConnection();
		
		String sql = "insert into entidades values (?,?)";
		connection.setAutoCommit(false);
		
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1,entidade.getTituloDaEntidade());
		ps.setInt(2,entidade.getAmbito());
		ps.executeUpdate(sql);
		
		connection.setAutoCommit(true);
		
		
		ps.close();
		connection.close();
	}

	public Entidade getEntidade(Entidade entidade) {

		Entidade retorno = null;

		try {
			ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
			dataSource = connectionPool.getDataSource();
			
			Connection connection = dataSource.getConnection();
			
			
			String sql = "select * from entidades where nome = ?";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setString(1,entidade.getTituloDaEntidade());
			ps.executeQuery();

			ResultSet rs = ps.getResultSet();

			if (rs.next()) {
				int id = rs.getInt("id");
				String titulo = rs.getString("nome");
				int ambitoID = rs.getInt("ambitoID");
				retorno = new Entidade(id, titulo, ambitoID);
			}

			rs.close();
			ps.close();
			connection.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return retorno;
	}

	public ArrayList<Entidade> getAllEntidades() {

		ArrayList<Entidade> dadosDeRetorno = null;

		try {
			
			ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
			dataSource = connectionPool.getDataSource();
			
			Connection connection = dataSource.getConnection();

			String sql = "select * from entidades";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();

			if (rs != null) {
				
				dadosDeRetorno = new ArrayList<Entidade>();
				
				while (rs.next()) {
					int id = rs.getInt("id");
					String titulo = rs.getString("nome");
					int ambitoID = rs.getInt("ambitoID");
					dadosDeRetorno.add(new Entidade(id, titulo, ambitoID));
					
				}
			}


			ps.close();
			connection.close();


		} catch (Exception e) {
			e.printStackTrace();
		}
		return dadosDeRetorno;
		

	}
}