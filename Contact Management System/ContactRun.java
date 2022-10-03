package ContactManagement;
import java.sql.*;
import java.util.Scanner;

public class ContactRun extends ContactDB{
	public static void main(String[] args) {
//		try {
//			//class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","");
//			Statement smt=con.createStatement();
//			ResultSet rs=smt.executeQuery("Select * from details where Name='Pavithra'");
//			while(rs.next()) {
//				System.out.println(rs.getString(3));
//			}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		ContactRun D=new ContactRun();
		Scanner scan=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("1-Add Contacts");
			System.out.println("2-Update Contacts");
			System.out.println("3-Search Contacts");
			System.out.println("4-Delete Contacts");
			System.out.println("5-Show Contacts");
			System.out.println("6-Exist Application");
			System.out.println("Enter Your Choice");
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
