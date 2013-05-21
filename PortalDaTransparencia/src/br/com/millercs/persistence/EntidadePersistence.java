package br.com.millercs.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.millercs.models.Entidade;
import br.com.millercs.system.Config;
import br.com.millercs.system.DataConnection;

public class EntidadePersistence {

	public void addEntidade(Entidade entidade) throws SQLException {

		DataConnection dataConnection = new DataConnection();
		Connection connection = dataConnection.getConnection();

		String sql = "insert into " + Config.getBdName()
				+ ".entidades values ('" + entidade.getTituloDaEntidade()
				+ "','" + entidade.getAmbito() + "')";

		Statement s = connection.createStatement();
		s.executeUpdate(sql);

		connection.close();
		s.close();
	}

	public Entidade getEntidade(Entidade entidade) {

		Entidade retorno = null;

		try {
			DataConnection dataConnection = new DataConnection();
			Connection connection = dataConnection.getConnection();

			String sql = "select * from " + Config.getBdName()
					+ ".entidades where nome = '"
					+ entidade.getTituloDaEntidade() + "'";

			ResultSet rs = dataConnection.getResultSet(sql);

			if (rs.next()) {
				int id = rs.getInt("id");
				String titulo = rs.getString("nome");
				int ambitoID = rs.getInt("ambitoID");
				retorno = new Entidade(id, titulo, ambitoID);
			}

			connection.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return retorno;
	}

	public ArrayList<Entidade> listEntidades() {

		ArrayList<Entidade> dadosDeRetorno = new ArrayList<>();

		try {
			DataConnection dataConnection = new DataConnection();

			String sql = "select * from " + Config.getBdName() + ".entidades'";

			ResultSet rs = dataConnection.getResultSet(sql);

			if (rs != null) {
				
				while (rs.next()) {
					int id = rs.getInt("id");
					String titulo = rs.getString("nome");
					int ambitoID = rs.getInt("ambitoID");
					dadosDeRetorno.add(new Entidade(id, titulo, ambitoID));
					
				}
			}

			dataConnection.closeConnection();
			rs.close();
			return dadosDeRetorno;

		} catch (Exception e) {

		}
		return null;
		

	}
}