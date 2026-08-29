package POO.applications;

import java.util.Locale;
import java.util.Scanner;

import POO.entities.BancAccount01;
import POO.exceptions.BancAccount01Exception;

public class exercicio09BancAccount01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdram limit: ");
		double withdrawLimit = sc.nextDouble();
				
		BancAccount01 account = new BancAccount01(number, holder, balance, withdrawLimit);
				
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
			
		try {
			account.withdraw(withdraw);
			account.validateWithdraw(withdraw);
			System.out.println("New Balance: " + account.getBalance());	
		}catch(BancAccount01Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();

	}

}
