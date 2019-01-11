package entidade;

public class Triangulo {   //CLASSE É A DEFINICAO DO TIPO
	
	public double a;
	public double b;
	public double c;
	
	public double area () { //nao recebe nenhum parametro alem de a,b,c que ja sao atributos da classe
		
		double p = (a + b + c)/2;
		return Math.sqrt(p * (p-a)* (p-b)* (p-c));
	}	


}
