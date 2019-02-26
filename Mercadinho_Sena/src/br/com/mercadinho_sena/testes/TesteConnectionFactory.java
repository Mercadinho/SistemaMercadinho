package br.com.mercadinho_sena.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.mecadinho_sena.jdbc.ConnectionFactory;

public class TesteConnectionFactory {

	public static void main(String[] args) throws SQLException {
		Connection conexaoJava = DriverManager.getConnection("jdbc:mysql://localhost/mercadinho_sena","root","");
        System.out.println("Bem Vindo ao Mercadinho Sena!");
        conexaoJava.close();
        
        Connection conexao = new ConnectionFactory().getConnection();
        
        try {
        	conexao.close();
        } catch (SQLException e) {
        	e.printStackTrace();
        	System.out.println();
        }
	}

}
