package orientacaoObjetos.applications;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjetos.entities.PessoaAltura;

public class exercicio06PessoaAltura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		sc.nextLine();
		
		PessoaAltura[] pessoaAltura = new PessoaAltura[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Informe seu nome:");
			String nome = sc.nextLine();
			System.out.print("Informe sua idade:");
			int idade = sc.nextInt();
			System.out.print("Informe sua altura:");
			double altura = sc.nextDouble();
			sc.nextLine();
			pessoaAltura[i] = new PessoaAltura(nome,idade,altura);
		}
		
		double soma = 0.0;
		double alturaMedia = 0.0;
		
		for (int i =0; i<n; i++) {
			soma += pessoaAltura[i].getAltura();
		}
		
		alturaMedia = soma/n;
		
		int menorDe16 = 0;
		
		for (int i=0; i<n; i++) {
			if(pessoaAltura[i].getIdade()<16) {
				menorDe16++;
			}
		}
		
		double porcentagemMenorDe16 = (double) menorDe16/n * 100;
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:%n",i+1);
			System.out.println(pessoaAltura[i]);
		}
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagemMenorDe16);
		
		for(int i=0; i<n; i++) {
			if(pessoaAltura[i].getIdade()<16) {
				System.out.println(pessoaAltura[i].getNome());
			}
		}
		
		sc.close();

	}

}
