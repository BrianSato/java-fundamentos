package POO.applications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import POO.models.Contract;
import POO.models.Installment;
import POO.services.ContractService;
import POO.services.PaypalService;

public class exercicio10Interace {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato");
		System.out.print("Numero: ");
		Integer number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(),fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas: ");
		for(Installment installment : contract.getInstallments() ) {
			System.out.println(installment);
		}
		
		sc.close();

	}

}
