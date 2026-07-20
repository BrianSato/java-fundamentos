package orientacaoObjetos.applications;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjetos.entities.CurrencyConverter;

public class exercicio04CurrencyConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double dollarAmount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(dollarPrice, dollarAmount);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		
		
		sc.close();

	}

}
