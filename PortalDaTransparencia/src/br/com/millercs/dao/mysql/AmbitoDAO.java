package br.com.millercs.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import br.com.millercs.dao.ConnectionPool;
import br.com.millercs.dao.interfaces.IAmbitoDAO;

public class AmbitoDAO implements IAmbitoDAO {

	private DataSource dataSource = null;

	public AmbitoDAO() {
		ConnectionPool connectionPool = ConnectionPool.getConnectionPool(); 
		this.dataSource = connectionPool.getDataSource();
	}
	public String getAmbitoByID(int id) {

		String dadosDeRetorno = null;
		
		try {
			
			Connection connection = dataSource.getConnection();

			connection.setAutoCommit(false);

			String sql = "select * from ambitos where id = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, String.valueOf(id));
			ps.executeUpdate();
			
			connection.setAutoCommit(true);
			
			ResultSet rs = ps.getResultSet();

			if (rs.next()) {
				
				dadosDeRetorno = rs.getString("titulo");

			}

			connection.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dadosDeRetorno;
	}
}