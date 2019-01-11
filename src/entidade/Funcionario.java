package entidade;

public class Funcionario {
	
	public String nome;
	public double salarioB;
	public double imposto;
	
	
	
	public double salarioL () {
		
		return salarioB - imposto;
		
	}
	
	public void aumentaSalario (double porcentagem) {
		
		this.salarioB = salarioB + (salarioB * porcentagem)/100;	//PODERIA USAR SEM O THIS, POIS NAO HÁ AMBIGUIDADE
		
	}
	public String toString () {
		
		return "EMPREGADO: "
				+ nome
				+ ", $ "
				+ String.format("%.2f", salarioL ());
	}
	
}
