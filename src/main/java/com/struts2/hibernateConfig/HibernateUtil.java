package com.struts2.hibernateConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	
	public static SessionFactory getSession()
	{
		if(sessionFactory==null)
		{
			sessionFactory=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
			
		}
		return sessionFactory;
	}
	
	
}
