package bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAO;
import model.Cidade;

@ManagedBean
@ViewScoped
public class CidadeBean extends AbstractBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cidade cidade = new Cidade();
	private List<Cidade> cidades;
	private Cidade cidadeSelecionada = new Cidade();

	public void limpaFormulario() {
		this.cidade = new Cidade();
	}

	public void grava() {
		DAO<Cidade> dao = new DAO<Cidade>(Cidade.class);
		if (cidade.getId() == null) {
			dao.adiciona(cidade);
			displayInfoMessageToUser("Cidade Salva com Sucesso");
		} else {
			dao.atualiza(cidade);
			displayInfoMessageToUser("Cidade Atualizada com Sucesso");
		}
		limpaFormulario();
		cidades = getCidades();
	}

	public void carregaForm() {

		if (getCidadeSelecionada() == null) {

			displayInfoMessageToUser("Selecione uma Cidade");
		} else {
			this.cidade = getCidadeSelecionada();
		}

	}

	public void cancelar() {
		this.cidade = new Cidade();
	}

	public List<Cidade> getCidades() {

		return cidades = new DAO<Cidade>(Cidade.class).listaTodos();
	}

	public void remove() {

		if (getCidadeSelecionada() != null) {

			DAO<Cidade> dao = new DAO<Cidade>(Cidade.class);
			dao.remove(getCidadeSelecionada());

			displayInfoMessageToUser("Cidade removida com Sucesso");

			this.cidades = dao.listaTodos();
		} else {
			displayErrorMessageToUser("Selecione uma Cidade");
		}
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Cidade getCidadeSelecionada() {
		return cidadeSelecionada;
	}

	public void setCidadeSelecionada(Cidade cidadeSelecionada) {
		this.cidadeSelecionada = cidadeSelecionada;
	}

}
