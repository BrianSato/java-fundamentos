package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();
		
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<n; i++) {
			vetA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B");
		for(int i=0; i<n; i++) {
			vetB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		int[] vetC = new int[n];
		for(int i=0; i<n; i++) {
			vetC[i] = vetA[i] + vetB[i];
			System.out.printf("%d%n", vetC[i]);
		}
		
				
		sc.close();
	}

}
