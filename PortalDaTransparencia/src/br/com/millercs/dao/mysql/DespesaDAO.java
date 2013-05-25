package br.com.millercs.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import br.com.millercs.dao.ConnectionPool;
import br.com.millercs.dao.interfaces.IDespesaDAO;
import br.com.millercs.models.Despesa;

public class DespesaDAO implements IDespesaDAO {

	private DataSource dataSource = null;

	@Override
	public ArrayList<Despesa> getDespesasFromEntidadeID(int id) {

		ArrayList<Despesa> dadosDeRetorno = null;

		try {

			ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
			dataSource = connectionPool.getDataSource();

			Connection connection = dataSource.getConnection();

			String sql = "select * from despesas where idDaEntidade=" + id;
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.executeQuery();
			ResultSet rs = ps.getResultSet();

			if (rs != null) {

				dadosDeRetorno = new ArrayList<Despesa>();

				while (rs.next()) {
					
					int idDaDespesa = rs.getInt("idDespesa");
					String numeroDoEmpenho = rs.getString("numeroDoEmpenho");
					String tipoDoEmpenho = rs.getString("tipoDoEmpenho");
					String dataDoEmpenho = rs.getString("dataDoEmpenho");
					double valorDaDespesa = rs.getDouble("valorDaDespesa");
					double valorLiquidado = rs.getDouble("valorLiquidado");
					String dataDaLiquidacao = rs.getString("dataDaLiquidacao");
					String nomeDoCredor = rs.getString("nomeDoCredor");
					String descricaoDaDespesa = rs
							.getString("descricaoDaDespesa");
					dadosDeRetorno.add(new Despesa(idDaDespesa,
							numeroDoEmpenho, tipoDoEmpenho, dataDoEmpenho,
							valorDaDespesa, valorLiquidado, dataDaLiquidacao,
							nomeDoCredor, descricaoDaDespesa, id));
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