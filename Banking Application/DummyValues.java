package Banking;
import java.util.Scanner;



public class DummyValues {
      static LogicLayer task=new LogicLayer();
	 static Scanner scan=new Scanner(System.in);
	
	 public static  void initialValuesInserting1()
	    {
	    	CustomerDet custom=new CustomerDet();
	    	custom.setCusId(5001);
	    	custom.setUserName(5001);
	    	custom.setBranch("chennai");
	    	custom.setCustomerName("Ashika");
	    	custom.setAddress("chennai");
	    	custom.setPassword("Pass@5001");
	    	custom.setBalance(1000);
	    	custom.setMobileNumber(901231237);  
				try {
					task.addCustomerDetails(custom);
				}
				catch (Exception e)
				{
					System.out.println("The exception in customer dummy values "+ e.getMessage());
					e.printStackTrace();
				}
		
	    
	    //2
	  
	    	CustomerDet custom2=new CustomerDet();
	    	custom2.setCusId(5002);
	    	custom2.setBranch("chennai");
	    	custom2.setUserName(5002);
	    	custom2.setAddress("Chennai");
	    	custom2.setCustomerName("Antany");
	    	custom2.setPassword("Pass@5002");
	    	custom.setBalance(2000);
	    	custom.setMobileNumber(909031237);
	 
	    		try {
					task.addCustomerDetails(custom2);
				} catch (Exception e) {
					System.out.println("The exception in customer dummy values "+ e.getMessage());
					e.printStackTrace();
				}
			
	  
	    //3
	        CustomerDet custom3=new CustomerDet();
	    	custom3.setCusId(5003);
	    	custom3.setUserName(5003);
	    	custom3.setAddress("Chennai");
	    	custom3.setCustomerName("Richard");
	    	custom3.setBranch("karaikudi");
	    	custom3.setPassword("Pass@5003");
	    	custom.setBalance(2000);
	    	custom.setMobileNumber(909231237);
	    	
	    		try {
					task.addCustomerDetails(custom3);
				} 
	    		catch (Exception e)
	    		{
					System.out.println("The exception in customer dummy values "+ e.getMessage());
					e.printStackTrace();
				}
			
	    	
	   
	    //4
		  
		    	CustomerDet custom4=new CustomerDet();
		    	custom4.setCusId(5004);
		    	custom4.setBranch("karaikudi");
		    	custom4.setUserName(5004);
		    	custom4.setCustomerName("Michael");
		    	custom4.setAddress("Karaiudi");
		    	custom4.setPassword("Pass@5004");
		    	custom.setBalance(2000);
		    	custom.setMobileNumber(989231237);
		    		try {
					task.addCustomerDetails(custom4);
				} 
	    		catch (Exception e) 
	    		{
					System.out.println("The exception in customer dummy values "+ e.getMessage());
					e.printStackTrace();
				}
		    		//5
	    		CustomerDet custom5=new CustomerDet();
		    	custom5.setCusId(5005);
		    	custom5.setBranch("karaikudi");
		    	custom5.setAddress("Karaikudi");
		    	custom5.setCustomerName("Richy");
		    	custom5.setUserName(5005);
		    	custom5.setPassword("Pass@5005");
		    	custom5.setBalance(3000);
		    	custom5.setMobileNumber(989231757);
		    		try {
						task.addCustomerDetails(custom5);
					} 
		    		catch (Exception e) 
		    		{
						System.out.println("The exception in customer dummy values "+ e.getMessage());
						e.printStackTrace();
					}
		    		//6
		    	CustomerDet custom6=new CustomerDet();
			    custom6.setCusId(5006);
			    custom6.setBranch("karaikudi");
			    custom6.setUserName(5006);
			    custom6.setAddress("karaikudi");
			    custom6.setCustomerName("Veronica");
			    custom6.setPassword("Pass@5006");
			    custom6.setBalance(5000);
			    custom6.setMobileNumber(989121237);
			    	try {
						task.addCustomerDetails(custom6);
						
					} 
			    	catch (Exception e) 
			    	{
				    	System.out.println("The exception in customer dummy values "+ e.getMessage());
					   e.printStackTrace();
						}
			//7		
			   	CustomerDet custom7=new CustomerDet();
				custom7.setCusId(5007);
				custom7.setBranch("karaikudi");
				custom7.setUserName(5007);
				custom7.setAddress("Chennai");
				custom7.setCustomerName("Joe");
				custom7.setPassword("Pass@5007");
				custom7.setBalance(5000);
				custom7.setMobileNumber(989121237);
					try {
						task.addCustomerDetails(custom7);
					} 
				   	catch (Exception e) 
				  	{
				    	System.out.println("The exception in customer dummy values "+ e.getMessage());
				   	    e.printStackTrace();
					}
	 
	
	    	//1
	    	AccountDet account=new AccountDet();
	    	account.setAccId(3001);
	    	account.setCusId(5001);
	    	account.setBalance(1000);
	    	account.setBranch("karaikudi");
	    	account.setStatus(true);
	    	try {
	    		task.addAccountDetails(account);
	    	}
	    	catch (Exception e) {
	    		System.out.println("The exception in account dummy values "+ e.getMessage());
				e.printStackTrace();
			}
	    	//2
	    	AccountDet account1=new AccountDet();
	    	account.setAccId(3002);
	    	account.setCusId(5002);
	    	account1.setBalance(200000);
	    	account1.setBranch("karaikudi");
	    	account1.setStatus(true);
	    	try {
	    		task.addAccountDetails(account1);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("The exception in account dummy values "+ e.getMessage());
	    		e.printStackTrace();
	    	}
	    	//3
	    	AccountDet account3=new AccountDet();
	    	account3.setAccId(3003);
	    	account3.setCusId(5003);
	    	account3.setBalance(200000);
	    	account3.setBranch("karaikudi");
	    	account3.setStatus(true);
	    	try {
	    		task.addAccountDetails(account3);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("The exception in account dummy values "+ e.getMessage());
	    		e.printStackTrace();
	    	}
	    	//4
	    	AccountDet account2=new AccountDet();
	    	account2.setAccId(3004);
	    	account2.setCusId(5004);
	    	account2.setBalance(200000);
	    	account2.setBranch("karaikudi");
	    	account2.setStatus(true);
	    	try {
	    		task.addAccountDetails(account2);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("The exception in account dummy values "+ e.getMessage());
	    		e.printStackTrace();
	    	}
	    	//5
	    	AccountDet account5=new AccountDet();
	    	account5.setAccId(3005);
	    	account5.setCusId(5005);
	    	account5.setBalance(1000);
	    	account5.setBranch("karaikudi");
	    	account5.setStatus(true);
	    	try {
	    		task.addAccountDetails(account5);
	    	}
	    	catch (Exception e) {
	    		System.out.println("The exception in account dummy values "+ e.getMessage());
				e.printStackTrace();
			}
	    	//6
	    	AccountDet account6=new AccountDet();
	    	account6.setAccId(3006);
	    	account6.setCusId(5006);
	    	account6.setBalance(1000);
	    	account6.setBranch("karaikudi");
	    	account6.setStatus(true);
	    	try {
	    		task.addAccountDetails(account6);
	    	}
	    	catch (Exception e) {
	    		System.out.println("The exception in account dummy values "+ e.getMessage());
				e.printStackTrace();
			}
	    	//7
	    	AccountDet account7=new AccountDet();
	    	account7.setAccId(3007);
	    	account7.setCusId(5007);
	    	account7.setBalance(1000);
	    	account7.setBranch("karaikudi");
	    	account7.setStatus(true);
	    	try {
	    		task.addAccountDetails(account7);
	    	}
	    	catch (Exception e) {
	    		System.out.println("The exception in account dummy values "+ e.getMessage());
				e.printStackTrace();
			}
	    	   	
	    }
	    
}