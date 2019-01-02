package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import models.entities.CarRental;
import models.entities.Vehicle;
import models.services.RentalServices;
import models.services.TaxServices;

public class Program {

	public static void main(String[] args) throws ParseException {
		

		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyy HH:ss");
		
		
		
		System.out.println("Enter rental Date ");
		System.out.println("Enter car Model: ");
		String carModel= sc.nextLine();
		System.out.println("Pickup (dd/MM/yyy HH:ss): ");
		Date initial= sdf.parse(sc.nextLine());
		System.out.println("Return (dd/MM/yyy HH:ss): ");
		Date finish= sdf.parse(sc.nextLine());
		
		CarRental cr= new CarRental(initial, finish, new Vehicle(carModel));
		
		System.out.println("Enter price per Hour: ");
		double valueHour= sc.nextDouble();
		System.out.println("Enter price per Day: ");
		double valueDay= sc.nextDouble();
		
		RentalServices rs= new RentalServices(valueHour, valueDay, new TaxServices());
		
		rs.processInvoice(cr);
		System.out.println("\n\nInvoice: ");
		System.out.println("BasicPayment: "+String.format("%.2f", cr.getInvoice().getBasicPayament()));
		System.out.println("Taxt: "+String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("TotalPayament: "+String.format("%.2f", cr.getInvoice().getTotalPayament()));
		
		sc.close();
	}

}
