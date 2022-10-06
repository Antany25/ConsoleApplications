package BankingView;
import java.util.*;

import BankingModel.AccountDet;
import BankingModel.CustomerDet;
import BankingModel.DummyValues;
import BankingModel.LoanPojo;
import BankingModel.LogicLayer;

public class BankRun {
	 static Scanner input=new Scanner(System.in);
	 static LogicLayer log=new LogicLayer();
	
	 public static void main(String[] args)
		{
			BankRun run=new BankRun();
			DummyValues.initialValuesInserting1();
			System.out.println("Enter the userId");
			int id=input.nextInt();
			String pass ="";
			int count=3;
			boolean valid=true;
			a:while(valid) {
				System.out.println("Enter the password ");
				pass=input.next();
				char p[]=pass.toCharArray();
					for(int i=1;i<p.length;i++) {
						if((p[0]>='A' && p[0]<='Z')&&(p.length>7 && p.length<15)&&((p[i]=='!')||(p[i]=='@')||(p[i]=='#')||(p[i]=='$')||(p[i]=='&')||(p[i]=='*')||(p[i]>='a' && p[i]<='z')||(p[i]>=0 && p[i]<=9))) {
							valid=false;
							continue a;
						}
						else {
							count--;
							System.out.println("The Password is Incorrect, You have "+count+" chance left");
							if(count==0) {
								System.out.println("You leftout the chance please contact bank");
								return;}
							continue a;
						}
					}
			}
			String name=" ";
			try {
				name=log.loginPasswords(id, pass);
				 System.out.println("the user is "+ name);
			} 
			catch (Exception e) 
			{			
				e.printStackTrace();
			}
		
			if(name == "Customer")
			{
				boolean flag=true;
				while(flag)
				{
					System.out.println("Enter a number in between 1 to 7 ");
				    System.out.println("1-to Add customer ");
					System.out.println("2-getCustomerDetails");
				    System.out.println("3-balanceEnquiry");
					System.out.println("4-amount Trasfer");
				    System.out.println("5-loan Section");
				    System.out.println("6-transcation history of your Account");
				    System.out.println("7-Exist");
					int n=input.nextInt();
					switch(n)
					{
					case 1:run.customerAdd();break;
					
					case 2:run.getCustomerDetails();break;
				       
					case 3:run.balanceEnquiry();break;
					
					case 4:run.amountTransfer();break;
					
					case 5:run.loanSectionCustomer();break;
					
					case 6:run.transactionHistory();break;
				    
					case 7:flag=!flag;break;
					}
				}
			}
			else if(name == "Admin")
			{

			 boolean flag=true;
			 while(flag) 
			 {
				 System.out.println("Enter the number to get th Account access");
				 System.out.println("1-Add accounts ");
				 System.out.println("2-get All Accounts");
				 System.out.println("3-All Customer Accounts");
				 System.out.println("4-amountDeposit By Admin");
				 System.out.println("5-amount withdrawn by Admin");
				 System.out.println("6-loanApplied checking ");
				 System.out.println("7-loan Approval By Admin");
				 System.out.println("8-All history checking");
				 System.out.println("9-All Accounts Balance");
				 System.out.println("10-Exist");
				 int n=input.nextInt();
				 switch(n)
				 {
				 case 1:run.addingAccounts();break;
					 
				 case 2:run.getAccountDetails();break;
					 
				 case 3:run.allCustomerAccounts();break;
				 
				 case 4:run.amountDepositAdmin();break;
					 
				 case 5:run.amountWithdrawnAdmin();break;
					 
				 case 6:run.loanAppliedSeekingStatus();break;
				 
				 case 7:run.loanApproveAdmin();break;
					 
				 case 8:run.historyOfAccountsAdmin();break;
				 
				 case 9:run.allAccountsSumBalance();break;
				 
				 case 10:flag=!flag;break;
				 }
		}
	}		
}
	 
	////////customer
	 //add Customer
	 public void customerAdd() 
	  {
		CustomerDet custom=new CustomerDet();
		System.out.println("Enter the customer name ");
		String name=input.next();
		custom.setCustomerName(name);
		System.out.println("Enter the address ");
		String address=input.next();
		custom.setAddress(address);
		System.out.println("Enter the branch ");
		String branch=input.next();
		custom.setBranch(branch);
		System.out.println("Enter the initialAmount ");
		long balance=input.nextLong();
		custom.setBalance(balance);
		
		try {
			System.out.println(log.addCustomerDetails(custom));
			
		} 
		catch (Exception e)
		{
			 System.out.println("the exception in customerAdd "+ e.getMessage());
			e.printStackTrace();
		} 
		
	   }
	 
	 public void getCustomerDetails()
     {
	  	System.out.println("Enter the customerId");
	  	int customerId=input.nextInt();
	  	try {
				CustomerDet custom=log.getCustomerDetails(customerId);
				if(custom != null)
				{
					System.out.println(custom);
				}
				else {
					System.out.println("your id is not presents ");
				}
			} 
	  	catch (Exception e) 
	  	{
				System.out.println("the exception in get Customer "+ e.getMessage());
				e.printStackTrace();
		}
      }
	    public void balanceEnquiry()
	    {
	    	System.out.println("Enter the accountId to get the balance enquiry ");
	    	int accId=input.nextInt();
	    	try {
				double bal=log.balanceEnquiryDetails(accId);
				System.out.println("the current balance enquiry in your accountId "+ accId + "  Account is "+ bal);
			} 
	    	catch (Exception e) 
	    	{
	    		System.out.println("the exception in balance enquiry "+ e.getMessage());
				e.printStackTrace();
			}
	    }
	    //
	    public void openAccounts()
	    {
	    	CustomerDet customDet=new CustomerDet();
	    	AccountDet accountDet=new AccountDet();
	    	System.out.println("Enter th name to open Accounts ");
	    	String customerName=input.nextLine();
	    	customDet.setCustomerName(customerName);
	    	System.out.println("Enter the Address ");
	    	String address=input.nextLine();
	    	customDet.setAddress(address);
	    	System.out.println("Enter the branch ");
	    	String branch=input.nextLine();
	    	customDet.setBranch(branch);
	    	System.out.println("Enter the mobile number ");
	    	long number=input.nextLong();
	    	customDet.setMobileNumber(number);
	    	System.out.println("Enter the initial balance Amounts ");
	    	double balance=input.nextDouble();
	    	customDet.setBalance(balance);
	    	accountDet.setBalance(balance);
	    	accountDet.setStatus(true);
	    	try {
	    	  int val=	log.openAccountsCustomer(customDet,accountDet);
	    	  System.out.println("your accountId is "+ val);
	    	  System.out.println("Accounts opened successfully ");
	    	}
	    	catch(Exception e)
	    	{
	    		 System.out.println("the exception in open Accounts  "+ e.getMessage());
	    	}
	    	
	    }
	
	//amounttransfer
	    
	    public void amountTransfer()
	    {
	    	System.out.println("Enter the accountId to transfer ");
	    	int accId=input.nextInt();
	    	System.out.println("Enter your customer id ");
	    	int cusId=input.nextInt();
	    	System.out.println("Enter the balance ");
	    	double bal=input.nextDouble();
	    	System.out.println("Enter the transfered account Id ");
	    	int accId1=input.nextInt();
	    	System.out.println("Enter the depositing customerId");
	    	int cusId1=input.nextInt();
	    	input.nextLine();
	    	try {
				log.transferMoney(accId, bal, accId1,cusId,cusId1);
			} 
	    	catch (Exception e)
	    	{
	    		System.out.println("the exception in amount transfer "+ e.getMessage());
				e.printStackTrace();
			}
	    }
	    public void loanSectionCustomer()
	    {
	    	LoanPojo loan=new LoanPojo();
	    	System.out.println("Enter the customerId ");
	    	int cusId=input.nextInt();
	    	input.nextLine();
	    	System.out.println("Enter the accountId ");
	    	int accId=input.nextInt();
	    	input.nextLine();
	    	System.out.println("Do you want any loans ? ");
	    	String type=input.nextLine();
	    	
	    	System.out.println(" Enter the type of loans "
	    			+ "1-Educational Loans"
	    			+"2-personal Loans"
	    			+"3-Bussiness Loans"
	    			+"4-car loans"
	    			+"5-Medical Loan" +"between 1 to 5");
	    	System.out.println("Enter the number of loans you want ");
	    	int loanAmount=input.nextInt();
	    	System.out.println("Enter the "+ loanAmount +" to get ");
	    	for(int i=0;i<loanAmount;i++)
	    	{
	    		
	    	int loanNumber=input.nextInt();
	    	loan.setLoanNumber(loanNumber);
	    	loan.setStatus("loan pending");
	    	
	    	input.nextLine();
	    	try {
	    		System.out.println(log.loanForCustomers(cusId, accId, type, loan));
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("the exception in loan section "+ e.getMessage());
	    		e.getMessage();
	    	}}
	    	
	    }
	    // 
	    public void customerAllAccountSumOfMoney()
	    {
	    	System.out.println("Enter the customerId ");
	    	int n=input.nextInt();
	    	try {
	    	  double bal=log.allAccountsSumMoney(n);
	    	  System.out.println("The total amount in your all accounts is "+ bal);
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("the exception in amount sum of all Accounts "+ e.getMessage());
	    	}
	    }
	    
	//history
		   public  void transactionHistory()
		   {
			   System.out.println("Enter the customerid to seek the transaction details ");
			   int id =input.nextInt();
			   input.nextLine();
			   try {
				  System.out.println(log.transactionListDetails(id));
			   }
			   catch(Exception e)
			   {
				   System.out.println("The exception in transaction details history "+ e.getMessage());
			   }
		   }
	
	//Accounts 
		   public void addingAccounts()
			{
				AccountDet acc=new AccountDet();
				System.out.println("Enter the cusId ");
				int cusId=input.nextInt();
				acc.setCusId(cusId);
				System.out.println("Enter the balance ");
				long bal=input.nextLong();
				input.nextLine();
				acc.setBalance(bal);
				System.out.println("Enter the branch");
				String branch=input.nextLine();
				acc.setBranch(branch);
				acc.setStatus(true);
				try {
					String output=log.addAccountDetails(acc);
					if(output!=null)
					{
				    System.out.println(output);
					System.out.println("Accounts added successfully ");
					}
					else {
						System.out.println("Account details are empty ");
					}
				}
				catch(Exception exception)
				{
					System.out.println("Exception in adding Accounts Main "+ exception.getMessage());
				}
			}
		    public void getAccountDetails()
		    {
		    	System.out.println("Enter a accountId");
		    	int accId=input.nextInt();
		    	input.nextLine();
		    	try {
					System.out.println(log.getAccountDetails(accId));
				} 
		    	catch (Exception e)
		    	{
					 System.out.println("the exception in get Account only  "+ e.getMessage());
					e.printStackTrace();
				}
		    }
	
		    
		    public void customerallAccount()
		    {
		    	System.out.println("Enter the customerId ");
		    	int cusId=input.nextInt();
		    	input.nextLine();
		    	try {
		    		log.getCustomerAllAccounts(cusId);
		    	}
		    	catch(Exception ex)
		    	{
		    		System.out.println("the exception occurs in get customer All Accounts  run "+ ex.getMessage());
		    	}
		    }
		    
		    public void loanAppliedSeekingStatus()
		    {
		    	System.out.println("Enter the Account Id to check loan Applied or not ");
		    	int accountId=input.nextInt();
		    	input.nextLine();
		    	try {
		    		LoanPojo loan=log.loanStatusSeeking(accountId);
		    		if(loan != null)
		    		{
		    			System.out.println(loan);
		    		}
		    		else {
		    			System.out.println("Details are Empty ");
		    		}
		    	}
		    	catch(Exception e)
		    	{
		    		System.out.println("Exception in loan seeking status "+ e.getMessage());
		    	}
		    }
	
		    public void allAccountsSumBalance()
		    {
		    	System.out.println("Enter the customerId ");
		    	int cusId=input.nextInt();
		    	input.nextLine();
		    	try {
		    		double amount=log.allAccountsSumMoney(cusId);
		    		System.out.println("All accounts Sum Of Money is "+ amount);
		    		
		    	}
		    	catch(Exception e)
		    	{
		    		System.out.println("The exception in all accounts sum  "+ e.getMessage());
		    	}
		    }

			   public void loanApproveAdmin()
			   {
				   System.out.println("Enter the accountId to change loan status ");
				   int accountId=input.nextInt();
				   input.nextLine();
				   System.out.println("Enter to approve or not ");
				   String val=input.nextLine();
				   try {
					  System.out.println(log.adminLoanApprooved(accountId,val));
				   }
				   catch(Exception e) {
					   System.out.println("The Exception in loan approved Admin "+ e.getMessage());
				   }
			   }
			   
			   public void amountDepositAdmin()
			   {
				   System.out.println("Enter the accountId to deposit by admin ");
				   int accountId=input.nextInt();
				   System.out.println("Enter the balance amount to transfer deposit ");
				   double bal=input.nextDouble();
				   input.nextLine();
				  
				   try {
					   System.out.println(log.adminTransferDeposit(accountId, bal));
					   }
				   catch(Exception e)
				   {
					   System.out.println("The exception in amountDeposit for admin "+ e.getMessage());			   
				   }
			   }
			   
			   
			   public void amountWithdrawnAdmin()
			   {
				   System.out.println("Enter the accountId to withdrawn by admin ");
				   int accountId=input.nextInt();
				   System.out.println("Enter the balance amount to transfer withdraw ");
				   double val=input.nextDouble();
				   input.nextLine();
				  
				   try {
					   
					   System.out.println(log.adminTransferWithdrawn(accountId, val));
				   }
				   catch(Exception e)
				   {
					   System.out.println("The exception in amountwithdraw for admin "+ e.getMessage());			   
				   }
			   }
			   
			   public void historyOfAccountsAdmin()
			   {
				   System.out.println("Admin to get the transaction details ");
				   try {
					   System.out.println(log.adminHistoryCheck());
				   }
				   catch(Exception e)
				   {
					   System.out.println("The exception in history Check by admin "+ e.getMessage());
				   }
			   }
	          
			   public void allAccountsAdmin()
			   {
				   System.out.println("All accounts are access by Admin are : ");
				   try {
					   System.out.println(log.adminHandlesAllaccount());
				   }
				   catch(Exception e)
				   {
					   System.out.println("The exception in allAccount seeking "+ e.getMessage());
				   }
			   }
			 
			   
			   public void allCustomerAccounts()
			   {
				   System.out.println("All Customer Accounts are : ");
				   try {
					   System.out.println(log.allCustomerDetails());
				   }
				   catch(Exception e)
				   {
					   System.out.println("The exception in allCustomer seeking "+ e.getMessage());
				   }
				   
			   }
	
	
	
}
