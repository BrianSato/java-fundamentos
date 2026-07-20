package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod,qnt;
		double preco;
		
		cod = sc.nextInt();
		qnt = sc.nextInt();
		
		if (cod == 1) {
			preco = qnt * 4.00;
		}
		else if (cod == 2) {
			preco = qnt * 4.50;
		}
		else if (cod == 3) {
			preco = qnt * 5.00;
		}
		else if (cod == 4) {
			preco = qnt * 2.00;
		}
		else {
			preco = qnt * 1.50;
		}
		
		System.out.printf("Total: %.2f%n", preco );
		
		sc.close();

	}

}
