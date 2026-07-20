package condicionais;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o primeiro valor:");
		int A = sc.nextInt();
		System.out.println("Informe o segundo valor:");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println(" Os valores " + A + " e "  + B  + " SÃO MULTIPLOS");
		}
		else {
			System.out.println("Os valores " + A + " e "  + B  + " NÃO SÃO MULTIPLOS");
		}
		
		
		sc.close();

	}

}
