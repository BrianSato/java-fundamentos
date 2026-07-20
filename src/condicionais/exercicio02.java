package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número:");
		numero = sc.nextInt();
		
		if ( numero %2  ==  0) {
			System.out.println(" O número " + numero + " é PAR");
		}
		else {
			System.out.println("O número " + numero + " é IMPAR");
		}
		
		sc.close();

	}

}
