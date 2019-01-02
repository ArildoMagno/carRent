package models.entities;

import java.util.Date;


public class CarRental {

	private Date initial;
	private Date finish;
	
	

	private Vehicle vehicle;
	private Invoice invoice;
	

	public CarRental() {
		
	}


	public CarRental(Date initial, Date finish, Vehicle vehicle) {
		this.initial = initial;
		this.finish = finish;
		this.vehicle = vehicle;
	}



	public Date getInitial() {
		return initial;
	}

	public void setInitial(Date initial) {
		this.initial = initial;
	}


	public Date getFinish() {
		return finish;
	}


	public void setFinish(Date finish) {
		this.finish = finish;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public Invoice getInvoice() {
		return invoice;
	}


	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	
	
	
}
