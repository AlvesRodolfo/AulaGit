package entidade;

public class VecProduct {
	
	private String nome;
	private double preco;

	
	public VecProduct (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome () {
		return nome;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco() {
		this.preco = preco;
	}
}
