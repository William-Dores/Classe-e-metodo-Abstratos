package entities;

public class PessoaFisica extends Pessoa {
	private Double gastoSaude;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public double taxa() {
		double soma = 0.0;
		
		if (rendaAnual >= 20.000) {
			soma = rendaAnual * 25 / 100;
		}
		else {
			soma = rendaAnual * 15 / 100;
		}
		
		return soma - (gastoSaude * 50 / 100);
	}

}
