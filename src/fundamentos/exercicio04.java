package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n_funcionario = sc.nextInt();
		int horas_trabalhadas = sc.nextInt();
		double valor_hora = sc.nextDouble();
		double salario = horas_trabalhadas * valor_hora;
		
		System.out.println("NUMERO DO FUNCIONARIO:" + 	n_funcionario);
		System.out.printf("SALARIO DO FUNCIONARIO: U$ %.2f", salario);
		
		
		sc.close();

	}

}
