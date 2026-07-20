package JavaWhile;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (codigo != 4) {
			
			if (codigo == 1) {
				alcool += 1;
			}
			else if ( codigo == 2) {
				gasolina += 1;
			}
			else if ( codigo == 3) {
				diesel += 1;
			}
			else {
				System.out.println("Código inválido");
			}
			
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " +  alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	
		sc.close();

	}

}
