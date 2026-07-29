package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite o numero:");
			vet[i] = sc.nextInt();
		}
		
		int qntPares = 0;
		System.out.println("NUMEROS PARES:");
		for(int i=0; i<n; i++) {
			if (vet[i] % 2 ==  0) {
				System.out.printf("%d ", vet[i]);
				qntPares++;
			}
		}
		
		System.out.printf("\nQUANTIDADE PARES:%d", qntPares);
		
		
		sc.close();

	}

}
