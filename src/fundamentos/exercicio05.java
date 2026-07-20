package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int CodPeca01 = sc.nextInt();
		int QntPeca01 = sc.nextInt();
		double ValorPeca01 = sc.nextDouble();
		
		int CodPeca02 = sc.nextInt();
		int QntPeca02 = sc.nextInt();
		double ValorPeca02 = sc.nextDouble();
		
		double ValorPagamento = QntPeca01 * ValorPeca01 + QntPeca02 * ValorPeca02;
		
		System.out.println("VALOR A PAGAR:" + ValorPagamento);
		
		sc.close();

	}

}
