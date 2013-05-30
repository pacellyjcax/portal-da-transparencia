package br.com.millercs.servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import br.com.millercs.dao.ConnectionPool;
import br.com.millercs.language.Language;
import br.com.millercs.language.PT_BR;
import br.com.millercs.system.Config;
import br.com.millercs.system.UrlRobot;


public class ContextListenerServlet implements ServletContextListener {
	
	
	private ConnectionPool connectionPool = null;

	@SuppressWarnings("unused")
	//Esse método é chamado uma única vez, ao servidor de aplicação startar
	public void contextInitialized(ServletContextEvent event) {
		this.connectionPool = ConnectionPool.getConnectionPool();
		
		Config config = new Config();
		Language language = new PT_BR();
		UrlRobot urlRobot = new UrlRobot();
	}

	//Esse método é chamado uma única vez também ao servidor stopar
	public void contextDestroyed(ServletContextEvent arg0) {
		this.connectionPool.destroyDataSource();
	}
	
}