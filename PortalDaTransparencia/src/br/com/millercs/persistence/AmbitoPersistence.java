package br.com.millercs.persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.millercs.models.Integer;
import br.com.millercs.system.Config;
import br.com.millercs.system.DataConnection;

public class AmbitoPersistence {
	
	public void addAmbito(Integer ambito)throws SQLException{

		DataConnection dataConnection = new DataConnection();
		Connection connection = dataConnection.getConnection();
		
		String sql = "insert into "+Config.getBdName()+".ambitos values ('"+ambito.getTituloDoAmbito()+"')";
		
		Statement s = connection.createStatement();
		s.executeUpdate(sql);
		
		connection.close();
		s.close();
	}	

	public Integer getAmbitoByID(int id){
		
		Integer retorno = null;
		
		try {
			DataConnection dataConnection = new DataConnection();
			Connection connection = dataConnection.getConnection();
			
			
			String sql = "select * from "+Config.getBdName()+".Ambito where id = '"+id+"'";
			
				
			ResultSet rs = dataConnection.getResultSet(sql);
			
			
			if(rs.next()){
				int ambitoID = rs.getInt("id");
				String titulo = rs.getString("titulo");
				
				retorno = new Integer(ambitoID,titulo);
			}
			
			connection.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return retorno;
	}
}