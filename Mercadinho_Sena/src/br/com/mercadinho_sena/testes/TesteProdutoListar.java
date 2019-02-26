package br.com.mercadinho_sena.testes;

import br.com.mercadinho_sena.DAO.ProdutosDAO;
import br.com.mercadinho_sena.encapsulamentos.Produtos;

public class TesteProdutoListar {

	public static void main(String[] args) {	
		ProdutosDAO list = new ProdutosDAO();
		for(Produtos e : list.read()) {
			System.out.println("Codigo: " + e.getCodigo());
			System.out.println("Fornecedor: " + e.getFornecedor());
			System.out.println("Nome: " + e.getNome());
			System.out.println("Marca: " + e.getMarca());
			System.out.println("Quantidade: " + e.getQuantidade());
			System.out.println("Valor Fornecedoer: " + e.getValor_fornecedor());
			System.out.println("Valor Produto: " + e.getValor_produto());
			System.out.println("Data: " + e.getData_compra_produto());
		}
	}
}
		