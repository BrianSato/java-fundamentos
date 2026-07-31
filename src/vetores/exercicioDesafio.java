package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicioDesafio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];
		String[] email = new String[10];
		
		System.out.print("How many rooms will be rented? ");
		int qnt = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<qnt; i++) {
			
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name:");
			String nome_temp = sc.nextLine();
			System.out.print("Email:");
			String email_temp = sc.next();
			System.out.print("Room:");
			int quarto =  sc.nextInt();
			sc.nextLine();
			
			name[quarto] = nome_temp;
			email[quarto] = email_temp;
		}
		
		System.out.println("Busy rooms:");
		
		for(int i=0; i<10; i++) {
			if(name[i] != null) {
				System.out.println(i + ":" + name[i] + "," + email[i]);
			}
		}
		
		sc.close();

	}

}
