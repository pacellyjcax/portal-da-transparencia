package br.com.millercs.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.com.millercs.dao.ConnectionPool;


public class ContextListenerServlet implements ServletContextListener {
	
	
	private ConnectionPool connectionPool = null;

	
	//Esse método é chamado uma única vez, ao servidor de aplicação startar
	public void contextInitialized(ServletContextEvent event) {
		this.connectionPool = ConnectionPool.getConnectionPool();
	}

	//Esse método é chamado uma única vez também ao servidor stopar
	public void contextDestroyed(ServletContextEvent arg0) {
		this.connectionPool.destroyDataSource();
	}
	
}