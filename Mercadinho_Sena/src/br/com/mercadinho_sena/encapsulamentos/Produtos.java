package br.com.mercadinho_sena.encapsulamentos;

public class Produtos {
	
	private int id_produto;
	private int codigo;
    private String fornecedor;
    private String nome;
    private String marca;
    private int quantidade;
    private float valor_fornecedor;
    private float valor_produto;
    private String data_compra_produto;
    
    public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValor_fornecedor() {
		return valor_fornecedor;
	}
	public void setValor_fornecedor(float valor_fornecedor) {
		this.valor_fornecedor = valor_fornecedor;
	}
	public float getValor_produto() {
		return valor_produto;
	}
	public void setValor_produto(float valor_produto) {
		this.valor_produto = valor_produto;
	}
	public String getData_compra_produto() {
		return data_compra_produto;
	}
	public void setData_compra_produto(String data) {
		this.data_compra_produto = data;
	}
	
}
