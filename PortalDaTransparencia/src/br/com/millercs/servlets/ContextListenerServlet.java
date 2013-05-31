package br.com.millercs.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.com.millercs.dao.ConnectionPool;


public class ContextListenerServlet implements ServletContextListener {
	
	
	private ConnectionPool connectionPool = null;

	
	//Esse m�todo � chamado uma �nica vez, ao servidor de aplica��o startar
	public void contextInitialized(ServletContextEvent event) {
		this.connectionPool = ConnectionPool.getConnectionPool();
	}

	//Esse m�todo � chamado uma �nica vez tamb�m ao servidor stopar
	public void contextDestroyed(ServletContextEvent arg0) {
		this.connectionPool.destroyDataSource();
	}
	
}