package br.com.biblioteca.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.biblioteca.model.Endereco;

public class EnderecoJPA {
	
	private EntityManager em;
	
	public EnderecoJPA() {
		DAO dao = new DAO();
		em = dao.getEntity();		
	}
	
	public void save(Endereco e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();		
	}
	
	public void atualizar(Endereco e) {
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();		
	}
	
	public Endereco getById(final int id) {
		return em.find(Endereco.class, id); 
	}
	
	public void remover(Endereco e) {
		em.getTransaction().begin();
		Endereco endRemover = getById(e.getId());
		em.remove(endRemover);
		em.getTransaction().commit();		
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Endereco> getAll(){
		return em.createQuery("FROM " + Endereco.class.getName()).getResultList();
	}
	
	
	
	

}
