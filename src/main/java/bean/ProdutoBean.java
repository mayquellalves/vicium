package bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAO;
import model.Produto;

@ManagedBean
@ViewScoped
public class ProdutoBean extends AbstractBean implements Serializable {

	private Produto produto = new Produto();
	private List<Produto> produtos;
	private Produto produtoSelecionado = new Produto();

	public void grava() {

		DAO<Produto> daoProduto = new DAO<Produto>(Produto.class);
		if (produto.getId() == null) {
			daoProduto.adiciona(produto);
		} else {
			daoProduto.atualiza(produto);
		}

		this.produtos = daoProduto.listaTodos();
		limpaFormulario();
	}

	public void carregaForm() {

		if (validaProdutoSelecionado())
			this.produto = produtoSelecionado;

	}

	public void remove() {

		if (validaProdutoSelecionado()) {
			DAO<Produto> dao = new DAO<Produto>(Produto.class);
			dao.remove(produtoSelecionado);
			this.produtos = dao.listaTodos();
		}
	}
	
	public boolean validaProdutoSelecionado() {
		if (produtoSelecionado == null) {
			displayErrorMessageToUser("Selecione ao menos um cliente");
			return false;
		}

		return true;
	}


	public void limpaFormulario() {
		this.produto = new Produto();
	}

	public List<Produto> getProdutos() {

		return produtos = new DAO<Produto>(Produto.class).listaTodos();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

}
