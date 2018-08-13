package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import model.Parcela;
import model.Venda;

public class TestaVendaDao {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		VendaDAO v = new VendaDAO();
		
		List<Venda> vendas;
		List<Parcela> parcelas = new ArrayList<Parcela>();
		vendas = v.listaTodasVendas(3L);
		
		for (Venda venda : vendas) {
			for(int i = 0; i < venda.getParcela().size(); i++){
				parcelas.add(venda.getParcela().get(i));
			}
		}
		for (Parcela parcela : parcelas) {
			System.out.println(parcela.getDataParcela().getTime());
			System.out.println(parcela.getValorParcela());
		}
	}
	

}

