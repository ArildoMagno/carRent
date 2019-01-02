package models.entities;

public class Invoice {

	private double basicPayament;
	private double tax;
	
	
	public Invoice() {
		
	}
	
	public Invoice(double basicPayament, double tax) {
		this.basicPayament = basicPayament;
		this.tax = tax;
	}


	public double getBasicPayament() {
		return basicPayament;
	}


	public void setBasicPayament(double basicPayament) {
		this.basicPayament = basicPayament;
	}


	public double getTax() {
		return tax;
	}


	public void setTax(double tax) {
		this.tax = tax;
	}




	public double getTotalPayament() {
		return basicPayament+tax;
	}
	
	
	
	
}
