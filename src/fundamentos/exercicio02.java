package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double formulaArea = pi * (raio * raio);
		
		System.out.printf("O valor do raio do circulo é: %.4f", formulaArea);
		
		sc.close();
	}

}
