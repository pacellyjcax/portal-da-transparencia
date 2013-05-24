
package br.com.millercs.dao;


import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * @author Karlos Thadeu
 * 
 * Esta classe obtem a instância do pool de conexões mantido pelo web container, na 
 * forma de um javax.sql.DataSource.
 * 
 */
public class ConnectionPool {

	//Se voce reparar, a String "jdbc/postgres" é a mesma contida no arquivo context.xml dentro da pasta META-INF
	//A String "java:comp/env" deve ser usada por convenção da própria linguagem java
	private static final String JNDI_RESOURCE = "java:comp/env/jdbc/mysql";

	
	private static ConnectionPool connectionPool = null;
	private DataSource dataSource;
	
	
	//Para garantir que eu terei apenas um Pool de Conexão durante toda a minha aplicação, eu uso o padrão de projetos Singleton
	//Perceba que o construtor da classe é privado
	private ConnectionPool() {
		try {
			InitialContext ic = new InitialContext();
			this.dataSource = (DataSource)ic.lookup(JNDI_RESOURCE);
			ic.close();
		} catch(Exception e) {
			e.printStackTrace();			
		}
	}
	
	//A única forma de eu obter uma instância ConnectionPool é chamando esse método estático.
	public static ConnectionPool getConnectionPool(){
		if(connectionPool == null){
			connectionPool = new ConnectionPool();
		}		
		return connectionPool;
	}	
	
	//O dataSource é o pool propriamente dito
	public DataSource getDataSource() {
		return this.dataSource;
	}
	
	public void destroyDataSource(){
		this.dataSource = null;
		System.gc();
	}	
}