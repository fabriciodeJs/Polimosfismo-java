package entities;

public class Empregado {
	
	private String nome;
	private Integer horas;
	private Double valorPorHoras;
	
	public Empregado(){
		
	}

	public Empregado(String nome, Integer horas, Double valorPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorPorHoras = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorPorHoras() {
		return valorPorHoras;
	}

	public void setValorPorHoras(Double valorPorHoras) {
		this.valorPorHoras = valorPorHoras;
	}
	
	public double pagamento() {
		return horas * valorPorHoras;
	}
	
}
