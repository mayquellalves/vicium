package model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import dao.DAO;

public class Insert {

	public static void main(String[] args) {
	
		//Pagamento
		Pagamento pagamento = new Pagamento();
		pagamento.setDescricao("Á PRAZO");
		pagamento.setDescricao("Á VISTA");
		
		
		DAO<Pagamento> daoPagamento = new DAO<Pagamento>(Pagamento.class);
		daoPagamento.adiciona(pagamento);
		
		//Cidade
		Cidade cidade = new Cidade();
		cidade.setNome("Paraguaçu Paulista");
		cidade.setCep("19230-020");
		cidade.setUf("SP");
		
		//Categoria1
		Categoria categoria1 = new Categoria();
		categoria1.setDescricao("ROUPA");
		Categoria categoria2 = new Categoria();
		categoria2.setDescricao("BICICLETA");
		Categoria categoria3 = new Categoria();
		categoria3.setDescricao("PECA BICICLETA");
		
		
		DAO<Categoria> daoCategoria = new DAO<Categoria>(Categoria.class);
		daoCategoria.adiciona(categoria1);
		daoCategoria.adiciona(categoria2);
		daoCategoria.adiciona(categoria3);
		
		
		Usuario usuario = new Usuario();
		usuario.setLogin("mayquel");
		usuario.setSenha("123456");
		
		DAO<Usuario> daoUsuario = new DAO<Usuario>(Usuario.class);
		daoUsuario.adiciona(usuario);
				
		/*//Categoria2
		Categoria categoria6 = new Categoria();
		categoria6.setId(1L);

		//Produto
		Produto produto = new Produto();
		produto.setCategoria(categoria1);
		produto.setDescricao("Aaa");
		produto.setMarca("Shimano");
		produto.setModelo("SSSS");
		produto.setTamanho("M");
		produto.setQuantidade(12);
		//Produto 2
		Produto produto2 = new Produto();
		produto2.setCategoria(categoria1);
		produto2.setDescricao("BBB");
		produto2.setMarca("St");
		produto2.setModelo("AAA");
		produto2.setTamanho("GG");
		produto2.setQuantidade(20);

		
		//Cliente
		Cliente cliente = new Cliente();
		cliente.setNome("Maicon Alves");
		cliente.setCelular("111111");
		cliente.setRg("12.333455");
		cliente.setCpf("345633");
		cliente.setEndereco("rrrreefas");
		
		//Venda
		Venda venda = new Venda();
		List<Item> itens = new ArrayList<Item>();
		//Item
		Item i = new Item();
		i.setQuantidade(2);
		i.setValorTotalItem(new BigDecimal("145.00"));
		i.setValorTotalItem(new BigDecimal("130.00"));
		i.setVenda(venda);
		
		
		Item i2 = new Item();
		i.setProduto(produto);
		i2.setProduto(produto2);
		i.setQuantidade(2);
		i2.setValorTotalItem(new BigDecimal("100.00"));
		i2.setValorTotalItem(new BigDecimal("110.00"));
		i2.setVenda(venda);
		
		itens.add(i);
		itens.add(i2);

		
		
		Calendar calculoDias = Calendar.getInstance();
		calculoDias.add(Calendar.DAY_OF_MONTH, 30);
			
		
		List<Parcela> p = new ArrayList<Parcela>();
		
		Parcela parcela = new Parcela();
		parcela.setStatus("PENDENTE");
		parcela.setNumeroParcela(1);
		parcela.setDataParcela(calculoDias);
		parcela.setValorParcela(new BigDecimal(10.08));
		parcela.setTotalParcela(2);
		parcela.setVenda(venda);
		p.add(parcela);
		
		calculoDias = parcela.getDataParcela();
		
		Parcela parcela2 = new Parcela();
		parcela2.setNumeroParcela(2);
		parcela2.setStatus("PENDENTE");
		parcela2.setNumeroParcela(1);
		parcela2.setDataParcela(calculoDias);
		parcela2.setValorParcela(new BigDecimal(10.08));
		parcela2.setTotalParcela(2);
		parcela2.setVenda(venda);
		p.add(parcela2);
		
		
		
		//venda
		venda.setCliente(cliente);
		venda.setItens(itens);
		venda.setParcela(p);
		venda.setValorTotal(new BigDecimal("20.16"));
		venda.setPagamento(pagamento);
		venda.setData(Calendar.getInstance());
		
		DAO<Categoria> daoCategoria6 = new DAO<Categoria>(Categoria.class);
		categoria1 = daoCategoria6.buscaPorId(categoria6.getId());
		
		
		DAO<Produto> daoProduto = new DAO<Produto>(Produto.class);
		daoProduto.adiciona(produto);
		daoProduto.adiciona(produto2);
		
		
		DAO<Cidade> daoCidade = new DAO<Cidade>(Cidade.class);
		daoCidade.adiciona(cidade);
		
		
		DAO<Cliente>clienteDao = new DAO<Cliente>(Cliente.class);
		clienteDao.adiciona(cliente);


		
		
		DAO<Venda> daoVenda = new DAO<Venda>(Venda.class);
		daoVenda.adiciona(venda);
		
		Usuario usuario = new Usuario();
		usuario.setLogin("mayquel");
		usuario.setSenha("1234");
		
		DAO<Usuario> daoUsuario = new DAO<Usuario>(Usuario.class);
		daoUsuario.adiciona(usuario);*/

	}
}
