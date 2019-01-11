package entidade;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;



public double notaFinal () {
	
	return nota1 + nota2 + nota3;
	}

public double faltando () {
	
	return 60 - notaFinal();
}

	
}
