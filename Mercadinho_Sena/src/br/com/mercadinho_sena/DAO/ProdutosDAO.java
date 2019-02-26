package br.com.mercadinho_sena.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.mecadinho_sena.jdbc.ConnectionFactory;
import br.com.mercadinho_sena.encapsulamentos.Produtos;

public class ProdutosDAO {
	private Connection conexao;
	
	public ProdutosDAO() {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Produtos produtos) {
		String sql = "INSERT INTO produtos(codigo,fornecedor,nome,marca,quantidade,valor_fornecedor,valor_produto,"
				+ "data_compra_produto)" + "values(? , ? , ? , ? , ? , ? , ? , ?)";
		try {
			PreparedStatement enviar = conexao.prepareStatement(sql);
			enviar.setInt(1, produtos.getCodigo());
			enviar.setString(2, produtos.getFornecedor());
			enviar.setString(3, produtos.getNome());
			enviar.setString(4, produtos.getMarca());
			enviar.setInt(5, produtos.getQuantidade());
			enviar.setFloat(6, produtos.getValor_fornecedor());
			enviar.setFloat(7, produtos.getValor_produto());
			enviar.setString(8,  produtos.getData_compra_produto());
			enviar.execute();
			enviar.close();
			
			conexao.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Produtos> read(){
		List<Produtos> produto = new ArrayList<Produtos>();
		String sql = "SELECT * FROM produtos";
		try {
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produtos p = new Produtos();
				p.setId_produto(rs.getInt("id_produto"));
				p.setCodigo(rs.getInt("Codigo"));
				p.setFornecedor(rs.getString("Fornecedor"));
				p.setNome(rs.getString("Nome"));
				p.setMarca(rs.getString("Marca"));
				p.setQuantidade(rs.getInt("Quantidade"));
				p.setValor_fornecedor(rs.getFloat("Valor_Fornecedor"));
				p.setValor_produto(rs.getFloat("Valor_Produto"));
				p.setData_compra_produto(rs.getString("Data_compra_produto"));
				
				produto.add(p);
			}
			
			ps.close();
			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produto;
	}
	
	public List<Produtos> readNome(String nome){
		List<Produtos> produto = new ArrayList<Produtos>();
		String sql = "SELECT * FROM produtos WHERE nome LIKE ?";
		
		try {
			PreparedStatement ps = this.conexao.prepareStatement(sql);
			ps.setString(1, "%" + nome + "%");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Produtos p = new Produtos();
				p.setId_produto(rs.getInt("id_produto"));
				p.setCodigo(rs.getInt("Codigo"));
				p.setFornecedor(rs.getString("Fornecedor"));
				p.setNome(rs.getString("Nome"));
				p.setMarca(rs.getString("Marca"));
				p.setQuantidade(rs.getInt("Quantidade"));
				p.setValor_fornecedor(rs.getFloat("Valor_Fornecedor"));
				p.setValor_produto(rs.getFloat("Valor_Produto"));
				p.setData_compra_produto(rs.getString("Data_compra_produto"));
				
				produto.add(p);
			}
			
			ps.close();
			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produto;
	}
	
	public void alterar(Produtos produtos) {
		String sql = "UPDATE produtos SET codigo = ?, fornecedor = ?, nome = ?, marca = ?, quantidade = ?, valor_fornecedor = ?, "
				+ "valor_Produto = ?, data_compra_produto = ? WHERE id_produto = ?";
		try {
			PreparedStatement enviar = conexao.prepareStatement(sql);
			enviar.setInt(1, produtos.getCodigo());
			enviar.setString(2, produtos.getFornecedor());
			enviar.setString(3, produtos.getNome());
			enviar.setString(4, produtos.getMarca());
			enviar.setInt(5, produtos.getQuantidade());
			enviar.setFloat(6, produtos.getValor_fornecedor());
			enviar.setFloat(7, produtos.getValor_produto());
			enviar.setString(8,  produtos.getData_compra_produto());
			enviar.setInt(9, produtos.getId_produto());
			enviar.execute();
			enviar.close();
			
			conexao.close();
			
			JOptionPane.showMessageDialog(null, "Alterado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deletar(Produtos produtos) {
		String sql = "DELETE FROM produtos WHERE id_produto = ?";
		try {
			PreparedStatement enviar = conexao.prepareStatement(sql);
			enviar.setInt(1, produtos.getId_produto());
			enviar.execute();
			enviar.close();
			
			conexao.close();
			
			JOptionPane.showMessageDialog(null, "Deletado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
