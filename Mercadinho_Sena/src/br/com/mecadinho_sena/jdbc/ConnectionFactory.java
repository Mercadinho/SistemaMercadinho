package br.com.mecadinho_sena.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
    	try {
    		return DriverManager.getConnection("jdbc:mysql://localhost/mercadinho_sena","root","");
    	} catch (SQLException e) {
    		e.printStackTrace();
    		System.out.println(e.getMessage());
    		return getConnection();
    	}
    }
}
