
package br.com.millercs.dao;


import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * @author Karlos Thadeu
 * 
 * Esta classe obtem a inst�ncia do pool de conex�es mantido pelo web container, na 
 * forma de um javax.sql.DataSource.
 * 
 */
public class ConnectionPool {

	//Se voce reparar, a String "jdbc/postgres" � a mesma contida no arquivo context.xml dentro da pasta META-INF
	//A String "java:comp/env" deve ser usada por conven��o da pr�pria linguagem java
	private static final String JNDI_RESOURCE = "java:comp/env/jdbc/mysql";

	
	private static ConnectionPool connectionPool = null;
	private DataSource dataSource;
	
	
	//Para garantir que eu terei apenas um Pool de Conex�o durante toda a minha aplica��o, eu uso o padr�o de projetos Singleton
	//Perceba que o construtor da classe � privado
	private ConnectionPool() {
		try {
			InitialContext ic = new InitialContext();
			this.dataSource = (DataSource)ic.lookup(JNDI_RESOURCE);
			ic.close();
		} catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
	//A �nica forma de eu obter uma inst�ncia ConnectionPool � chamando esse m�todo est�tico.
	public static ConnectionPool getConnectionPool(){
		if(connectionPool == null){
			connectionPool = new ConnectionPool();
		}		
		return connectionPool;
	}	
	
	//O dataSource � o pool propriamente dito
	public DataSource getDataSource() {
		return this.dataSource;
	}
	
	public void destroyDataSource(){
		this.dataSource = null;
		System.gc();
	}	
}