package entidade2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidade.enums.NiveldoTrabalhador;

public class Trabalhador {
	
	private String nome;
	private NiveldoTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento; // um trabalhador possui 1 departamento
	private List<HoraContrato> contrato = new ArrayList<>(); // um trabalhador possui varios contratos -- "varios" representa por uma lista
	
	public Trabalhador () {
		
	}

	public Trabalhador(String nome, NiveldoTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	} //NAO GERA CONSTRUTOR COM ATRIBUTOS DO TIPO LISTA -- APENAS INSTANCIA LOGO NA DEFINICAO DO ATRIBUTO

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NiveldoTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NiveldoTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContrato() {
		return contrato;
	}

	//NAO SE PODE UTILIZAR O SETCONTRATO --POIS UM CONTRATO SO PODE SER ADICIONADO POR MEIO DO METODO ADICIONARCONTRATO
	
    public void adicionarContrato (HoraContrato contrato) {
    	this.contrato.add(contrato);
    }
	
    public void removerContrato (HoraContrato contrato) {
    	this.contrato.remove(contrato);
    	
    }
    
    public double salarioTotal (int year, int month) {
    	
    	double sum = salarioBase;
    	Calendar cal = Calendar.getInstance();  //chamando o objeto calendario 
    	for (HoraContrato c : this.contrato) {  //para cada contrato do objeto HoraContrato faça o que segue.
    		cal.setTime(c.getData());
    		int c_year = cal.get(Calendar.YEAR);  //lendo o ano da data
    		int c_month = 1 + cal.get(Calendar.MONTH); //lendo o mes da data -- soma-se 1 pois janeiro comeca em "zero"
    		
    		if(c_year == year && c_month == month) {
    			sum += c.valorTotal();
    		}
    		
    	}
    	return sum;
    }
    
   
}
