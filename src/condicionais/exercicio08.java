package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double isentoImposto = salario - 2000.00;
		double imposto;
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if ( isentoImposto > 1 && isentoImposto < 1000.00) {
			imposto = isentoImposto * 0.8;
			System.out.printf("R$:%.2f%n", imposto);
		}
		else if ( isentoImposto > 1000.0 && isentoImposto < 4500.0) {
			imposto = (salario - 2000.0) * 1.8;
			System.out.printf("R$:%.2f%n", imposto);
		}
		else if ( salario > 4500.0) {
			imposto = (salario - 2000.0) * 2.8;
			System.out.printf("R$:%.2f%n", imposto);
		}
		
		sc.close();

	}

}
