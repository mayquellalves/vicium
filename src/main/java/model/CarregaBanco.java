package model;

import java.math.BigDecimal;

import dao.DAO;
import dao.UsuarioDAO;

public class CarregaBanco {

	public static void main(String[] args) {
		
		Cidade cidade = new Cidade();
		
		cidade.setNome("Quatá");
		cidade.setCep("19780-000");
		cidade.setUf("SP");

		
		
		DAO<Cidade> cidadeDao = new DAO<Cidade>(Cidade.class);
		cidadeDao.adiciona(cidade);
		
		Pagamento pgto = new Pagamento();
		pgto.setDescricao("	Á VISTA");
		
		Pagamento pgto2 = new Pagamento();
		pgto2.setDescricao("Á PRAZO");
		
		
		DAO<Pagamento> pgtoDao = new DAO<Pagamento>(Pagamento.class);
		pgtoDao.adiciona(pgto);
		pgtoDao.adiciona(pgto2);
		
		Categoria categoria1 = new Categoria();
		categoria1.setDescricao("ROUPA");
		
		Categoria categoria2 = new Categoria();
		categoria2.setDescricao("PECA");
		
		Categoria categoria3 = new Categoria();
		categoria3.setDescricao("BICICLETA");
		
		Produto produto = new Produto();
		produto.setDescricao("Arroz");
		produto.setMarca("123");
		produto.setModelo("BBBB");
		produto.setTamanho("12");
		produto.setValor(new BigDecimal("12.40"));
		
		
		DAO<Categoria> CategoriaDao = new DAO<Categoria>(Categoria.class);
		CategoriaDao.adiciona(categoria1);
		CategoriaDao.adiciona(categoria2);
		CategoriaDao.adiciona(categoria3);
		produto.setCategoria(categoria1);
		
		
		DAO<Produto> produtoDao = new DAO<Produto>(Produto.class);
		produtoDao.adiciona(produto);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Mayquel");
		cliente.setCidade(cidade);
		cliente.setCpf("1234556");
		cliente.setRg("21234556");
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("AA");
		fornecedor.setNomeFantasia("BBB");
		fornecedor.setCnpj("12345999");
		

		DAO<Fornecedor>daoFornecedor = new DAO<Fornecedor>(Fornecedor.class);
		daoFornecedor.adiciona(fornecedor);
		
		DAO<Cliente>daoCliente = new DAO<Cliente>(Cliente.class);
		daoCliente.adiciona(cliente);
		
		Usuario u = new Usuario();
		u.setLogin("mayquel");
		u.setSenha("1234");
		
		DAO<Usuario>uDao = new DAO<Usuario>(Usuario.class);
		uDao.adiciona(u);
		
	}
}
