package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.print("VALORES: ");
		for(int i=0; i<n; i++) {
			System.out.print(" "+vet[i]);
		}
		System.out.println();
		double soma = 0;
		
		for(int i=0; i<n; i++) {
			soma += vet[i];
		}
		System.out.printf("SOMA: %.2f", soma);
		System.out.println();
		
		double media = 0.0;
		for(int i=0; i<n; i++) {
			media = soma / n;
		}
		System.out.printf("MEDIA: %.2f", media);
		
		
		
		sc.close();
	}

}
