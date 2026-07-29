package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i=0; i<n ; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		double somaPar = 0.0;
		int numeroPar = 0;
		for(int i=0; i<n; i++) {
			if(vet[i]%2 == 0) {
				somaPar += vet[i];
				numeroPar ++;
			}
		}
		
		double media = somaPar/numeroPar;
		
		if(somaPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			System.out.printf("MEDIA DOS PARES: %.1f", media);
		}
		
		sc.close();

	}

}
