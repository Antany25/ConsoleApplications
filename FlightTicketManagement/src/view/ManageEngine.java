package view;

import java.util.Scanner;

import model.*;

public class ManageEngine extends FlightRunway {
	
	public static void main(String[] args) {
		DummyValues.insertDetails();
		boolean isInside=true;
		
		do {
			
			System.out.println("1-customerBooking\n2-showSeats\n3-cancelTicket\n4-View Customer Details\n5-View Flight Details");
			System.out.println("Choose the Case");
			Scanner scanner=new Scanner(System.in);
			ManageEngine run=new ManageEngine();
			int choose=scanner.nextInt();
			
			switch(choose) {
			case 1:run.customerBooking();break;
			
			case 2:run.showAvailableSeats();break;
			
			case 3:run.cancelTicket();break;
			
			case 4:run.showCustomerDetails();break;
			
			case 5:run.showFlightDetails();break;
			
			default:isInside=false;
			}
			
		}while(isInside);
	}
	
}
