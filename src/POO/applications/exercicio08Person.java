package POO.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import POO.entities.Person;
import POO.entities.PersonFisica;
import POO.entities.PersonJuridica;

public class exercicio08Person {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n ; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)?  ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double annualIncome = sc.nextDouble();
			
			if(option == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				list.add(new PersonFisica(name, annualIncome, healthExpenses));
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new PersonJuridica(name, annualIncome, numberOfEmployees));
				}
		}
		
		System.out.println("---------------------------");
		System.out.println("TAXES PAID:");
		
		double totalTaxes = 0.0;
		for(Person p : list) {
			double tax = p.taxRate();
			System.out.println(p.getName() + ": $ " + String.format("%.2f", tax));
			totalTaxes += tax;
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + totalTaxes);
		
		sc.close();

	}

}
