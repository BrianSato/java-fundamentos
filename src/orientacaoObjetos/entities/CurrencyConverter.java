package orientacaoObjetos.entities;

public class CurrencyConverter {
	
	public static double dollarToReal(double dollarPrice, double dollarAmount) {
		
		double amount = dollarPrice * dollarAmount;
		
		double iof = amount * 0.06;
		
		return amount + iof;
	}
	
}
