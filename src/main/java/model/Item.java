package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import util.OperacoesComBigDecimal;

@Entity
public class Item implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Venda venda;

	@ManyToOne
	private Produto produto;

	private Integer quantidade;

	private BigDecimal valorUnitario;

	private BigDecimal valorTotalItem;
	

	public BigDecimal getValorTotalItem() {
		
		if(quantidade != null && valorUnitario !=null){
			OperacoesComBigDecimal o = new OperacoesComBigDecimal();
			
			return o.multiplica(quantidade.toString(), valorUnitario.toString());
		}else{
			return null;
		}
		
		
	}

	public void setValorTotalItem(BigDecimal valorTotalItem) {
		this.valorTotalItem = valorTotalItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public BigDecimal getTotal() {
		
		
	
		if (quantidade != null && valorUnitario != null){
		
			BigDecimal formataQuantidade = new BigDecimal(quantidade);
			
			BigDecimal total = formataQuantidade.multiply( valorUnitario); 
			
			return total.setScale(2, RoundingMode.HALF_UP);
		
		}else{
			return null;
		}
	}
}
