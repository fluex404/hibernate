package com.fluex404.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public abstract class Database {
	private SessionFactory sessionFactory = null;
	
	public Database() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	public Session getSession() {
		return sessionFactory.openSession();
	}
}
