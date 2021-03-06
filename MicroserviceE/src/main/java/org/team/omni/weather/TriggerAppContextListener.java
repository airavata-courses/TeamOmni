package org.team.omni.weather;

import java.io.File;

import javax.servlet.ServletContextEvent;
import org.apache.log4j.Logger;
/**
 * 
 * @author Ameya Advankar
 *
 */
public class TriggerAppContextListener extends ApplicationContextListener {

	private static final String HOST_IP_STRING = "DOCKER_HOST";
	private static final String TRIGGER_SERVICE = "ForecastTriggerService";
	
	static {
		System.setProperty("my.log", System.getProperty("user.dir") + File.separator + "MicroE.log");
	}
	final static Logger logger = Logger.getLogger(TriggerAppContextListener.class);
	
	public TriggerAppContextListener() {
		this.address = System.getenv(HOST_IP_STRING);
		logger.info("Set this.address: "+this.address);
		System.out.println("Set this.address: "+this.address);
		this.port = 8083;
		this.maxWorkLoad = 100;
		this.serviceName = TRIGGER_SERVICE;
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		super.contextDestroyed(arg0);
	}

	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		logger.info("Context Path " + servletContextEvent.getServletContext().getContextPath());
		try{
			super.contextInitialized(servletContextEvent);
		}
		catch(Exception e){
			logger.error("Exception while initializing context",e);
		}
	}

}