package orientacaoObjetos.applications;

import java.util.Locale;
import java.util.Scanner;

import orientacaoObjetos.entities.Employee;

public class exercicio02Employee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Name:");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary:");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Employee:%s,$ %.2f%n", employee.name,employee.netSalary());
		
		System.out.println("Which percentage to increase salary?");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.netSalary());
		
		sc.close();

	}

}
