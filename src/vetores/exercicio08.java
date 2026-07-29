package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("nome: ");
			nome[i] = sc.nextLine();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maisVelho = 0;
		int posicaoMaisVelho = 0;
		for(int i=0; i<n; i++) {
			if(maisVelho < idade[i]) {
				maisVelho = idade[i];
				posicaoMaisVelho = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA:" + nome[posicaoMaisVelho]);
		
		sc.close();

	}

}
