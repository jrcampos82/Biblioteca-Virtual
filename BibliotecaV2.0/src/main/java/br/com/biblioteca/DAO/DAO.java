package br.com.biblioteca.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	
	private EntityManager em = null;
	final EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
	
	public DAO() {
		
		if(em == null) {
			em = emf.createEntityManager();
		}
	}
	
	public EntityManager getEntity(){
		return em;
	}

}
