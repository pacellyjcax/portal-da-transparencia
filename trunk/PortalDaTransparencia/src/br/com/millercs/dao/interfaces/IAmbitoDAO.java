package br.com.millercs.dao.interfaces;

import java.sql.SQLException;

import br.com.millercs.models.Integer;

public interface IAmbitoDAO {
	
	public void addAmbito(Integer ambito)throws SQLException;
	public Integer getAmbitoByID(int id);
	
}