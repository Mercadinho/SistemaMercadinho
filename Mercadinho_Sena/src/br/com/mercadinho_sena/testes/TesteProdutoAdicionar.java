package br.com.mercadinho_sena.testes;

import br.com.mercadinho_sena.DAO.ProdutosDAO;
import br.com.mercadinho_sena.encapsulamentos.Produtos;

public class TesteProdutoAdicionar {

	public static void main(String[] args) {
		Produtos p = new Produtos();
		p.setCodigo(3221);
		p.setFornecedor("Elisangela");
		p.setNome("tapioca");
		p.setMarca("sabiar");
		p.setQuantidade(10);
		p.setValor_fornecedor(6.80f);
		p.setValor_produto(3.50f);
		p.setData_compra_produto("21/12/2018");
		ProdutosDAO dao = new ProdutosDAO();
		dao.adiciona(p);

	}

}
