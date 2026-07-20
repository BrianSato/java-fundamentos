package JavaCondicionais;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int totalHoras;
		
		if(horaInicial < horaFinal) {
			totalHoras = horaFinal - horaInicial;
		}
		else {
			totalHoras = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + totalHoras + " HORA(S)");
			
		sc.close();

	}

}
