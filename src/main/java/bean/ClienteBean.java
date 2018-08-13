package bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.DAO;
import model.Cidade;
import model.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean extends AbstractBean implements Serializable {

	private Cliente cliente = new Cliente();
	private List<Cliente> clientes;
	private Cidade cidade = new Cidade();
	private Cliente clienteSelecionado = new Cliente();

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public void grava() {

		DAO<Cidade> daoCidade = new DAO<Cidade>(Cidade.class);
		Cidade c = daoCidade.buscaPorId(cidade.getId());
		cliente.setCidade(c);

		DAO<Cliente> daoCliente = new DAO<Cliente>(Cliente.class);
		if (cliente.getId() == null) {
			daoCliente.adiciona(cliente);
		} else {
			daoCliente.atualiza(cliente);
		}

		this.clientes = daoCliente.listaTodos();
		limpaFormulario();
	}

	public void carregaForm() {

		if (validaClienteSelecionado()) {

			this.cliente = clienteSelecionado;
		}

	}

	public void remove() {

		if (validaClienteSelecionado()) {

			DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
			dao.remove(clienteSelecionado);

			this.clientes = dao.listaTodos();
		}
	}

	public void limpaFormulario() {
		this.cliente = new Cliente();
	}

	public List<Cliente> getClientes() {

		return clientes = new DAO<Cliente>(Cliente.class).listaTodos();
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

	public boolean validaClienteSelecionado() {

		if (clienteSelecionado == null) {

			displayErrorMessageToUser("Selecione ao menos um cliente");

			return false;
		}

		return true;
	}
	
	
	
	
}
