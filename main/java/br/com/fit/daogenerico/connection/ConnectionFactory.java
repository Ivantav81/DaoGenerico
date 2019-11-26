package br.com.fit.daogenerico.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("crud2");;
	
	public static EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
	
}
