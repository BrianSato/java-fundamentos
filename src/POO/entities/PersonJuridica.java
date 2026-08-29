package POO.entities;

public class PersonJuridica extends Person{

	private Integer numberOfEmployees;
	
	public PersonJuridica() {
		super();
	}
	public PersonJuridica(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmpployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmpployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double taxRate() {
		double taxRate = getAnnualIncome() * 0.16;
		
		if(numberOfEmployees > 10 ) {
			taxRate = getAnnualIncome() * 0.14;
		}
		return taxRate;
	}
	
	
	
	
}
