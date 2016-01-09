package com.parvez;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	
	 
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		 ServletContext sc=	arg0.getServletContext();
		 String brandName=sc.getInitParameter("toyota");
		 Car toyotaCar=new Car(brandName);	 
		 sc.setAttribute("toyota", toyotaCar);
	}

}
