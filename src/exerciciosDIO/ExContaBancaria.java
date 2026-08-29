package exerciciosDIO;

public class ExContaBancaria {
	private double saldo;
	private double limiteChequeEspecial;
	
	//Construtores
	public ExContaBancaria(double depositoInicial) {
		saldo = depositoInicial;
		if(depositoInicial <= 500) {
			limiteChequeEspecial = 50;
		}else {
			limiteChequeEspecial = depositoInicial/2;
		}
	}
	
	//Getters
	public double getSaldo() {
		return saldo;
	}
	public double getLimiteChequeEspecial() {
		
		return limiteChequeEspecial;	
	}
	
	//Métodos
	public void depositar(double valor) {
		if(verificarUsoChequeEspecial()) {
			double valorUsado = - saldo;
			double taxa = valorUsado * 0.2;
			
			if(valor >= taxa) {	
				saldo += (valor - taxa);
			}else {
				saldo += valor;
				System.out.println("Depósito realizado. A taxa do cheque especial ainda não foi cobrada.");
			}
		}else{
			saldo += valor;
		}
	}
	
	public boolean sacar(double valor) {
		if(saldo + limiteChequeEspecial >= valor) {
			saldo -= valor;
			return true;
		}else{
			return false;
			}
		}

	public boolean pagarBoleto(double valor) {
		if(saldo + limiteChequeEspecial >= valor) {
			saldo -= valor;
			return true;
		}else{
			return false;
			}
		}
	
	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria saldo: R$" 
				+ saldo 
				+ ", limiteChequeEspecial : R$" 
				+ limiteChequeEspecial;
	}
	
}
