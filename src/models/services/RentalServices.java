package models.services;

import models.entities.CarRental;
import models.entities.Invoice;

public class RentalServices {

	private double valueHour;
	private double valueDay;
	
	private TaxServices taxService;
	
	public RentalServices() {
		
	}


	public RentalServices(double valueHour, double valueDay,TaxServices taxService) {
		this.taxService=taxService;
		this.valueHour = valueHour;
		this.valueDay = valueDay;
	}


	public double getValueHour() {
		return valueHour;
	}


	public void setValueHour(double valueHour) {
		this.valueHour = valueHour;
	}


	public double getValueDay() {
		return valueDay;
	}


	public void setValueDay(double valueDay) {
		this.valueDay = valueDay;
	}
	
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getInitial().getTime();
		long t2= carRental.getFinish().getTime();
		
	double hours=(double)(t2 - t1)/1000/60/60;
	double basicPayament;
	if(hours<12) {
		basicPayament=Math.ceil(hours)*valueHour;	
	
	}
	else {
		basicPayament=Math.ceil(hours/24)*valueDay;
	}

	
	
	double tax= taxService.tax(basicPayament);
		
		carRental.setInvoice(new Invoice(basicPayament,tax));
	
	}
	
	
	
}
