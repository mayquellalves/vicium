package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Venda;

public class VendaDAO {

	
	public List<Venda> listaTodasVendas(Long id){
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		//Query query = em.createQuery("select v from Venda v where v.cliente.id=" + cliente.getId());
		String jpql = "select v from Venda v where v.cliente.id = :id ";
		TypedQuery<Venda> query = em.createQuery(jpql, Venda.class);
		query.setParameter("id", id);
		
		return query.getResultList();
	}
}
