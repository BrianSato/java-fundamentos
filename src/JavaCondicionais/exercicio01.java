package JavaCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número inteiro:");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("O número " + numero + " é NEGATIVO");
		}
		else {
			System.out.println("O número " + numero + " é NÃO NEGATIVO");
		}
		
		sc.close();

	}

}
