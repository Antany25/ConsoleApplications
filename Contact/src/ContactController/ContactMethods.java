package ContactController;
import java.sql.*;

import java.util.Scanner;

import ContactModel.ContactDBConnect;
public class ContactMethods {
	static Scanner scan=new Scanner(System.in);
	static int num=5;
	static String str=" ";
	private Connection con=null;
	public  Connection getConnect() {	
		if(con==null) {
			return ContactDBConnect.Connect();}
		else {
			return con;}
	}

	public void AddContacts() {
		System.out.println("Enter the name");
		String name=scan.next();
		System.out.println("Enter the Mobile Number");
		long mobNum=scan.nextLong();
		System.out.println("Enter the Whatsapp Number if the mobile number is not the whatsapp number");
		long whatNum=scan.nextLong();
		System.out.println("Enter What type of this person to you Friend or Relation");
		String friRel=scan.next();
		System.out.println("Enter Yes if this person is Favourite Person");
		String favPer=scan.next();

		try {
			Connection con=getConnect();
			String str="INSERT INTO `details`(`SI No.`, `Name`, `Mobile Number`, `Whatsapp Number`, `Friends/Relations`, `Favourite Persons`)" + "Values(" + "'" +(++num)+ "',"
					+ "'" +name+ "', " + "'" +mobNum+ "', " + "'" +whatNum+ "',"+ "'" +friRel+ "', " + "'" +favPer+ "'" + ")";
			PreparedStatement pst = con.prepareStatement(str);
			int x = pst.executeUpdate();
			if (x == 1) {
				System.out.println("Contact Added Successfully");
				System.out.println();
				ShowContacts();}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}


	public void UpdateContacts() {
		System.out.println("Enter What You want To update \n1-Name,\n2-Mobile number,\n3-Whatsapp number,\n4-Friends/Relations,\n5-Favourite Person");
		int choose=scan.nextInt();
		System.out.println("Enter the persons name you want to change his name or mobile number or whatsapp number");
		String oldName=scan.next();
		try {
			Connection con=getConnect();
			int x =0;
			switch(choose) {
			case 1:System.out.println("Enter the New name");
			String newName=scan.next();
			String str="UPDATE `details` SET Name="+"'"+newName+"'"+"WHERE Name="+"'"+oldName+"'";
			PreparedStatement pst = con.prepareStatement(str);
			x = pst.executeUpdate();break;
			case 2:System.out.println("Enter the New Mobile Number");
			long newMobNum=scan.nextLong();
			String str1="UPDATE `details` SET Mobile Number="+"'"+newMobNum+"'"+"WHERE Name="+"'"+oldName+"'";
			PreparedStatement pst1 = con.prepareStatement(str1);
			x = pst1.executeUpdate();break;
			case 3:System.out.println("Enter the New Whatsapp Number");
			long newWhatNum=scan.nextLong();
			String str2="UPDATE `details` SET Whatsapp Number="+"'"+newWhatNum+"'"+"WHERE Name="+"'"+oldName+"'";
			PreparedStatement pst2 = con.prepareStatement(str2);
			x = pst2.executeUpdate();break;
			case 4:System.out.println("Enter Friend or Relation");
			String friendRel=scan.next();
			String str3="UPDATE `details` Friends/Relations="+"'"+friendRel+"'"+"WHERE Name="+"'"+oldName+"'";
			PreparedStatement pst3 = con.prepareStatement(str3);
			x = pst3.executeUpdate();break;
			case 5:System.out.println("Enter the Yes or No");
			String favPerson=scan.next();
			String str4="UPDATE `details` SET Favourite Persons="+"'"+favPerson+"'"+"WHERE Name="+"'"+oldName+"'";
			PreparedStatement pst4 = con.prepareStatement(str4);
			x = pst4.executeUpdate();break;
			}
			if (x == 1) {
				System.out.println("Contacts updated Successfully");
				System.out.println();
				ShowContacts();}
		} 
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}


	public void SearchContacts() {
		System.out.println("Enter the Searching Method \n1-By Name,\n2-By Mobile Number,\n3-By Whatsapp Number,\n4-By Friends Or Relations,\n5-By Favourite Persons");
		int Choose=scan.nextInt();
		try {
			Connection con=getConnect();
			int x=0;
			switch(Choose) {
			case 1:System.out.println("Enter the Whole Name");
			String wholeName=scan.next();
			String str="SELECT * FROM details WHERE Name="+"'"+wholeName+"%'";
			PreparedStatement pst = con.prepareStatement(str);
			x = pst.executeUpdate();break;

			case 2:System.out.println("Enter the Mobile Number");
			long mobNum=scan.nextLong();
			String str1="SELECT * FROM details WHERE Mobile Number="+"'"+mobNum+"%'";
			PreparedStatement pst1 = con.prepareStatement(str1);
			x = pst1.executeUpdate();break;

			case 3:System.out.println("Enter the Whatsapp  Number");
			long whatNum=scan.nextLong();
			String str2="SELECT * FROM details WHERE Whatsapp Number="+"'"+whatNum+"%'";
			PreparedStatement pst2 = con.prepareStatement(str2);
			x = pst2.executeUpdate();break;
			case 4:
				System.out.println("Enter Friend or Relation");
				String fRel=scan.next();
				String str3="SELECT * FROM details WHERE Friends/Relations="+"'"+fRel+"%'";
				PreparedStatement pst3 = con.prepareStatement(str3);
				x = pst3.executeUpdate();break;
			case 5:
				System.out.println("Enter Yes or No");
				String favPersons=scan.next();
				String str4="SELECT * FROM details WHERE Favourite Persons="+"'"+favPersons+"%'";
				PreparedStatement pst4 = con.prepareStatement(str4);
				x = pst4.executeUpdate();break;
			}
			if (x == 1) {
				System.out.println("Searched The Contacts Successfully");
				System.out.println();
				ShowContacts();}
		} 
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}


	public void DeleteContacts() {
		System.out.println("Enter the Name You want to delete");
		String delName=scan.next();
		try {
			Connection con=getConnect();
			String str="DELETE FROM details WHERE Name="+"'"+delName+"'";
			PreparedStatement pst = con.prepareStatement(str);
			int x = pst.executeUpdate();
			if (x == 1) {
				System.out.println("\nDeleted the Contacts Successfully\n");
				System.out.println();
				ShowContacts();}
		} 
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}


	public void ShowContacts() {
		try {
			Connection con=getConnect();
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("SELECT * FROM details");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}
}
