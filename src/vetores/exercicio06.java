package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			soma += vet[i];
		}
		System.out.println();
		
		double media = soma / n;
				
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for(int i=0; i<n; i++) {
			if (vet[i] < media) {
				System.out.printf("%.1f%n",vet[i]);
			}
		}
		
		sc.close();

	}

}
