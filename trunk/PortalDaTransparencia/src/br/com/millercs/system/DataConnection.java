package br.com.millercs.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.millercs.language.Language;

public class DataConnection {

	private String status = Language.BD_NOT_CONNECTED;

	public PreparedStatement preparedStatement;

	public String getConnectionStatus() {
		return status;
	}

	public void setConnectionStatus(String status) {
		this.status = status;
	}

	public boolean closeConnection() {

		try {

			getConnection().close();
			status = Language.BD_NOT_CONNECTED;
			return true;

		} catch (SQLException e) {
			return false;
		}
	}

	public java.sql.Connection getConnection() {
		Connection connection = null;
		try {
			String driverName = "com.mysql.jdbc.Driver";
			Class.forName(driverName);
			connection = DriverManager.getConnection(Config.getBdUrl(),
					Config.getBdUsername(), Config.getBdPassword());

			if (connection != null) {
				setConnectionStatus(Language.BD_CONNECTION_SUCCESSFUL);
			} else {
				setConnectionStatus(Language.BD_CONNECTION_FAIL);
			}

			return connection;

		} catch (ClassNotFoundException e) {

			System.out.println(Language.BD_DRIVER_NOT_FOUND);
			return null;

		} catch (SQLException e) {

			System.out.println(Language.BD_CONNECTION_FAIL);
			return null;

		}
	}
	
	public ResultSet getResultSet(String sql){
		ResultSet resSet = null;
		try {
			preparedStatement = getConnection().prepareStatement(sql);
			resSet= preparedStatement.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return resSet;
	}

}
