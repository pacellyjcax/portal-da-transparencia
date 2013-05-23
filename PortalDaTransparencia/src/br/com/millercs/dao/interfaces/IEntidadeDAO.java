package br.com.millercs.dao.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.millercs.models.Entidade;

public interface IEntidadeDAO {

	public void addEntidade(Entidade entidade) throws SQLException ;

	public Entidade getEntidade(Entidade entidade) ;

	public ArrayList<Entidade> listEntidades() ;
}