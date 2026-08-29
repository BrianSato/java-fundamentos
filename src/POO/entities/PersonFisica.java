package POO.entities;


public class PersonFisica extends Person{

	private Double healthExpenses;
	
	public PersonFisica() {
		super();
	}
	public PersonFisica(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double taxRate() {
		double taxRate;
		
		if(getAnnualIncome() < 20000.00) {
			taxRate = getAnnualIncome() * 0.15;
		}else {
			taxRate = getAnnualIncome() * 0.25;
		}
		if(healthExpenses > 0) {
			healthExpenses -= healthExpenses * 0.5;
		}
		taxRate -= healthExpenses;
		
		return taxRate;
	}
	
	
}
