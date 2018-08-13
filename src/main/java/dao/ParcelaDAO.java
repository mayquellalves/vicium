package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Parcela;

public class ParcelaDAO {

	private final DAO<Parcela> dao;
	private final EntityManager em;
	
	public ParcelaDAO( EntityManager em){
		
		this.em = em;
		dao = new DAO<Parcela>(Parcela.class);
	}
	
	public List<Parcela> pesquisaParcela(Long id){
		
		String jpql = "select p from parcela p where p.venda_id = :venda";
		TypedQuery<Parcela> query = this.em.createQuery(jpql, Parcela.class);
		query.setParameter("id", id);
		
		return query.getResultList();
		
	}
}
