package br.com.mercadinho_sena.testes;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.mecadinho_sena.jdbc.ConnectionFactory;
import br.com.mercadinho_sena.DAO.ProdutosDAO;

public class TesteProdutoDeletar {

	public static void main(String[] args) {
	    ProdutosDAO del = new ProdutosDAO();
	    del.deletar(null);
	    System.out.println("Deletado !");
	    Connection conexao = new ConnectionFactory().getConnection();
	    System.out.println("Conectado!");
	    try {
	    	conexao.close();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }

	}

}
