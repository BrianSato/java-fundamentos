package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite o numero:");
			vet[i] = sc.nextDouble();
		}
		
		double maiorNumero = vet[0];
		for(int i=0; i<n; i++) {
			if(maiorNumero < vet[i]){
				maiorNumero = vet[i];
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", maiorNumero);
		
		for(int i=0; i<n; i++) {
			if(vet[i] == maiorNumero) {
				System.out.printf("POSICAO DO MAIOR VALOR: %d",i);
			}
		}
		sc.close();
	}

}
