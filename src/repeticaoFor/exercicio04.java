package repeticaoFor;

import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double valor01 = sc.nextDouble();
			double valor02 = sc.nextDouble();
			
			if(valor02 == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double resultado = valor01/valor02;
				System.out.printf("%.1f%n", resultado);
			}
			
		}
		
		sc.close();

	}

}
