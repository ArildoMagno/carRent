package models.services;

public class TaxServices {

	
	public double tax(double amount) {
		if(amount < 100) {
			return amount*0.20;
		}
		else {
			return amount * 0.15;
		}
		
	
		
	}
	
	
}
