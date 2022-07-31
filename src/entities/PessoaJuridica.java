package entities;

public class PessoaJuridica extends Pessoa{
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double taxa() {
		double soma = 0.0;
		if (numFuncionarios <= 10) {
			soma = rendaAnual * 16 / 100;
		} else {
			soma = rendaAnual * 14 / 100;

		}
		return soma;
	}
}
