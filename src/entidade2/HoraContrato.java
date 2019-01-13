package entidade2;

import java.util.Date;

public class HoraContrato {
	
	private Date data;
	private Double valorHora;
	private Integer horas;
	
	public HoraContrato () {
		
	}

	public HoraContrato(Date data, Double valorhora, Integer horas) {
		this.data = data;
		this.valorHora = valorhora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorhora() {
		return valorHora;
	}

	public void setValorhora(Double valorhora) {
		this.valorHora = valorhora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double valorTotal() {
		
		return valorHora * horas;
	}
	
	
	}
