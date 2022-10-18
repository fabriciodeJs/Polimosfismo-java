package entities;

public class EmpregadoTerceirizado extends Empregado {

	private Double valorAdicional;
		
	public EmpregadoTerceirizado() {
	super();
	}

	public EmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora, Double valorAdicional) {
		super(nome, horas, valorPorHora);
		this.valorAdicional = valorAdicional;
	}


	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + valorAdicional * 1.1;
	}
}
