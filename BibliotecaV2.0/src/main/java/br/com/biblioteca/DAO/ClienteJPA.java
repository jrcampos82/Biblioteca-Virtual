package br.com.biblioteca.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.biblioteca.model.Cliente;

public class ClienteJPA {
	
	private EntityManager em;
	
	public ClienteJPA() {
		DAO dao = new DAO();
		em = dao.getEntity();
	}
	
	public Cliente getById(final int id) {
		return em.find(Cliente.class, id);
	}
	
	public void save(Cliente c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();		
	}
	
	// atualizar cliente
	public void atualizar(Cliente c) {
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();		
	}
	
	public void remover(Cliente c) {
		em.getTransaction().begin();
		Cliente clienteRemover = getById(c.getId());
		em.remove(clienteRemover);
		em.getTransaction().commit();		
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> getAll(){
		return em.createQuery("FROM " + Cliente.class.getName()).getResultList();
	}
	
	

}
