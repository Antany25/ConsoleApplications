package ContactManagement;
import java.sql.*;
import java.util.Scanner;
public class ContactDB {
	static Scanner scan=new Scanner(System.in);
	static int Num=5;
	static String str=" ";
	public static Connection getConnect() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts","root","");
			return con;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
	
	
	public static void AddContacts() {
		System.out.println("Enter the name");
		String Name=scan.next();
		System.out.println("Enter the Mobile Number");
		long MobNum=scan.nextLong();
		System.out.println("Enter the Whatsapp Number if the mobile number is not the whatsapp number");
		long WhatNum=scan.nextLong();
		System.out.println("Enter What type of this person to you Friend or Relation");
		String FriRel=scan.next();
		System.out.println("Enter Yes if this person is Favourite Person");
		String FavPer=scan.next();
		
		try {
			Connection con=getConnect();
			String str="INSERT INTO `details`(`SI No.`, `StartingName`, `Name`, `Mobile Number`, `Whatsapp Number`, `Friends/Relations`, `Favourite Persons`)" + "Values(" + "'" +(++Num)+ "'," + "'" +Name.charAt(0)+ "',"
					+ "'" +Name+ "', " + "'" +MobNum+ "', " + "'" +WhatNum+ "',"+ "'" +FriRel+ "', " + "'" +FavPer+ "'" + ")";
			PreparedStatement pst = con.prepareStatement(str);
			int x = pst.executeUpdate();
			if (x == 1) {
				System.out.println("Contact Added Successfully");}
			} 
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	public static void UpdateContacts() {
		System.out.println("Enter What You want To update 1-name,2-mobile number,3-whatsapp number,4-Friends/Relations,5-Favourite Person");
		int choose=scan.nextInt();
		System.out.println("Enter the persons name you want to change his name or mobile number or whatsapp number");
		String OldName=scan.next();
		try {
			Connection con=getConnect();
			if(choose==1) {
				System.out.println("Enter the New name");
				String NewName=scan.next();
				String str="UPDATE details SET Name="+"'"+NewName+"'"+"WHERE Name="+"'"+OldName+"'";}
			else if(choose==2) {
				System.out.println("Enter the New Mobile Number");
				String NewMobNum=scan.next();
				String str="UPDATE details SET Mobile Number="+"'"+NewMobNum+"'"+"WHERE Name="+"'"+OldName+"'";}
			else if(choose==3){
				System.out.println("Enter the New Whatsapp Number");
				String NewWhatNum=scan.next();
				String str="UPDATE details SET Whatsapp Number="+"'"+NewWhatNum+"'"+"WHERE Name="+"'"+OldName+"'";}
			else if(choose==4) {
				System.out.println("Enter Friend or Relation");
				String FriendRel=scan.next();
				String str="UPDATE details Friends/Relations="+"'"+FriendRel+"'"+"WHERE Name="+"'"+OldName+"'";}
			else {
				System.out.println("Enter the Yes or No");
				String FavPerson=scan.next();
				String str="UPDATE details SET Favourite Persons="+"'"+FavPerson+"'"+"WHERE Name="+"'"+OldName+"'";}
			PreparedStatement pst = con.prepareStatement(str);
			int x = pst.executeUpdate();
			if (x == 1) {
				System.out.println("Contacts updated Successfully");}
			} 
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	public static void SearchContacts() {
		System.out.println("Enter the Searching Method 1-By Name,2-By Mobile Number,3-By Whatsapp Number,4-By Friends Or Relations,5-By Favourite Persons");
		int Choose=scan.nextInt();
		try {
			Connection con=getConnect();
			if(Choose==1) {
				System.out.println("Enter the Whole Name");
				String WholeName=scan.next();
				String str="SELECT * FROM details WHERE Name="+"'"+WholeName+"%'";}
			else if(Choose==2) {
				System.out.println("Enter the Mobile Number");
				long MobNum=scan.nextLong();
				String str="SELECT * FROM details WHERE Mobile Number="+"'"+MobNum+"%'";}
			else if(Choose==3) {
				System.out.println("Enter the Whatsapp  Number");
				long WhatNum=scan.nextLong();
				String str="SELECT * FROM details WHERE Whatsapp Number="+"'"+WhatNum+"%'";}
			else if(Choose==4) {
				System.out.println("Enter Friend or Relation");
				String FRel=scan.next();
				String str="SELECT * FROM details WHERE Friends/Relations="+"'"+FRel+"%'";}
			else {
				System.out.println("Enter Yes or No");
				String FavPersons=scan.next();
				String str="SELECT * FROM details WHERE Favourite Persons="+"'"+FavPersons+"%'";
			}
			PreparedStatement pst = con.prepareStatement(str);
			int x = pst.executeUpdate();
			if (x == 1) {
				System.out.println("Searched The Contacts Successfully");}
			} 
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	public static void DeleteContacts() {
		System.out.println("Enter the Name You want to delete");
		String DelName=scan.next();
		try {
			Connection con=getConnect();
			String str="DELETE FROM details WHERE Name="+"'"+DelName+"'";
			PreparedStatement pst = con.prepareStatement(str);
			int x = pst.executeUpdate();
			if (x == 1) {
				System.out.println("\nInsert Completed\n");}
			} 
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	
	public static void ShowContacts() {
		try {
			Connection con=getConnect();
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("SELECT * FROM details");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
