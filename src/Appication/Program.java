package Appication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> listPessoa = new ArrayList<>();
		
		System.out.print("Informe a quantidade de pessoas para as taxas: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Informe os dados do #"+i+" pagador");
			System.out.print("Fisica ou Juridica (f/j)");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if (tipo == 'f') {
				System.out.print("Gasto com Saude: ");
				double gastoSaude = sc.nextDouble();
				listPessoa.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Numero de Funcionarios: ");
				int numFuncionarios = sc.nextInt();
				listPessoa.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXAS PAGAS: ");
		
		
		for (Pessoa pessoa : listPessoa) {
			System.out.println(pessoa.getNome() + " $ "+ String.format("%.2f", pessoa.taxa()));
		}
		
		System.out.println();
		
		double soma = 0.0;
		for (Pessoa pessoa : listPessoa) {
			soma += pessoa.taxa();
		}
		
		System.out.println("TAXAS TOTAL: $ "+ String.format("%.2f", soma));
		
		sc.close();
	}

}
