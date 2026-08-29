package POO.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public String priceTag() {
		return name + " (used) $ " + price + " (Manfacture date: " + sdf.format(manufactureDate) + ")";
	}
}
