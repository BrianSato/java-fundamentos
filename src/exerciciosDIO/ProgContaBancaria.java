package exerciciosDIO;

import java.util.Locale;
import java.util.Scanner;

public class ProgContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o depósito inicial: ");
		double depositoInicial = sc.nextDouble();
		ExContaBancaria conta = new ExContaBancaria(depositoInicial);
		
		int opcao;
		
		do {
			System.out.println("=====Menu de Operações do Banco======");
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Consultar Cheque Especial");
			System.out.println("3 - Depositar Dinheiro");
			System.out.println("4 - Sacar Dinheiro");
			System.out.println("5 - Pagar um boleto");
			System.out.println("6 - Verificar se a conta está usando cheque especial");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1 -> System.out.println("O seu saldo é de : R$ " + conta.getSaldo());
				case 2 -> System.out.println("O seu limite de cheque especial é: R$ " + conta.getLimiteChequeEspecial());
				case 3 -> depositar(conta,sc);
				case 4 -> sacar(conta,sc);
				case 5 -> pagarBoleto(conta,sc);
				case 6 -> verificaChequeEspecial(conta);
				case 0 -> System.out.println("Finalizando Programa...");
	
			}
			
		}while (opcao != 0);
		
		sc.close();
		
	}
	
	//Métodos
	public static void depositar(ExContaBancaria conta, Scanner sc) {
		System.out.println("Informe o valor a ser depositado: ");
		conta.depositar(sc.nextDouble());
		System.out.println("Transação efetuado com Sucasso!");
		System.out.println("Seu saldo atual é de : R$ " + conta.getSaldo());
	}
	public static void sacar(ExContaBancaria conta, Scanner sc) {
		System.out.println("Informe o valor a ser retirado: ");
		boolean sucesso = conta.sacar(sc.nextDouble());
		if(sucesso) {
			System.out.println("Transação efetuado com Sucasso!");
			System.out.println("Seu saldo atual é de : R$ " + conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para esta operação");
		}
	}
	public static void pagarBoleto(ExContaBancaria conta, Scanner sc) {
		System.out.println("Informe o valor a ser retirado: ");
		boolean sucesso = conta.sacar(sc.nextDouble());
		if(sucesso) {
			System.out.println("Transação efetuado com Sucasso!");
			System.out.println("Seu saldo atual é de : R$ " + conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para esta operação");
		}
	}
	public static void verificaChequeEspecial(ExContaBancaria conta) {
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("A conta está utilizando o cheque especial.");
		}else {
			System.out.println("A conta não está utilizando o cheque especial.");
		}
	}	

}

