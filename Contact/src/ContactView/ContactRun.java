package ContactView;
import java.util.Scanner;

import ContactController.ContactMethods;

public class ContactRun extends ContactController.ContactMethods{
	public static void main(String[] args) {

		ContactController.ContactMethods D=new ContactController.ContactMethods();
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("Enter Your Choice \n1-Add Contacts \n2-Update Contacts \n3-Search Contacts \n4-Delete Contacts \n5-Show Contacts \n6-Exit Application");
			int n=scan.nextInt();
			switch(n){
			case 1:D.AddContacts();break;
			
			case 2:D.UpdateContacts();break;
				
			case 3:D.SearchContacts();break;
				
			case 4:D.DeleteContacts();break;
			
			case 5:D.ShowContacts();break;
				
			case 6:flag=false;
			
			}
		}
	}
}
