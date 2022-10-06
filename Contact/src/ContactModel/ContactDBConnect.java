package ContactModel;

import java.sql.Connection;

import java.sql.DriverManager;

public class ContactDBConnect {
	
	public static Connection Connect() {
		try {
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts","root","");
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
}
