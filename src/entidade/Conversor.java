package entidade;

public class Conversor {
	
	public static double dolar;
	
	
	public static double conversor (double quantidade) {
		
		double valor = dolar * quantidade;
		return (valor) + ( 0.06 * valor); 
	}
	
	}

/*  package entidade;

public class Conversor {
	
	public static double IOF = 0.06;
	
	public static double conversor (double quantidade, double precoDoDolar) {

		return quantidade * precoDoDolar * (1.0 + IOF) 
	}
	
	}  */