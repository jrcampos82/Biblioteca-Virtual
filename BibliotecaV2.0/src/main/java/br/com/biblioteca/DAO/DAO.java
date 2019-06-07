package br.com.biblioteca.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO {
	
	private EntityManager em = null;
	
	public DAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		if(em == null) {
			em = emf.createEntityManager();
		}
	}
	
	public EntityManager getEntity(){
		return em;
	}

}
