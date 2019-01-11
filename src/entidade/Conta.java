package entidade;

public class Conta {
	
	private int numero;
	private String nome;
	private double saldo;

	
	public Conta (int numero, String nome, double depositoInicial) {
		
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial);   //chamando o metodo do deposito inicial
	}

	public Conta (int numero, String nome) {
		
		this.numero = numero;
		this.nome = nome;
		
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDepositoIncial() {
		return saldo;
	}
	
	public void deposito (double deposito) {  // se essa regra mudar, nao  precisa mudar o construtor de 3 argumentos
		
		saldo += deposito;
	}
	
	public void saque (double saque) {
		
		saldo -= saque + 5.00;  // - com - = +  e - com + = -
	}
	public String toString () {
		
		return "CONTA " 
				+ numero
				+ ", PROPRIETARIO: "
				+ nome
				+ ", BALANCE: $ "
				+ String.format("%.2f", saldo);
	}
}
