package orientacaoObjetos.applications;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjetos.entities.BankAccount;

public class exercicio05BankAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		
		System.out.print("Enter account number:");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String accountName = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		 if (response == 'y') {
			 System.out.print("Enter initial deposit value:");
			 double initialDeposit = sc.nextDouble();	
			 account = new BankAccount(accountNumber,accountName,initialDeposit);
		 }else {
			 account = new BankAccount(accountNumber,accountName);
		 }
		 System.out.println();
		 System.out.println("Account data:");
		 System.out.println(account);
		 
		 System.out.println();
		 System.out.print("Enter a deposit value:");
		 double depositValue = sc.nextDouble();
		 account.deposit(depositValue);
		 
		 System.out.println("Account data:");
		 System.out.println(account);
		 
		 System.out.println();
		 System.out.print("Enter a withdraw value:");
		 double withDrawValue = sc.nextDouble();
		 account.withdraw(withDrawValue);
		 
		 System.out.println("Account data :");
		 System.out.println(account); 
		
		sc.close();

	}

}
