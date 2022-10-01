package Banking;
import java.util.*;

import javax.security.auth.login.AccountException;

import java.time.LocalDate;
import java.time.LocalTime;

public class BankCache {
	
	Map<Integer,CustomerDet> customMap=new HashMap<>();
	Map<Integer,AccountDet>  accountMap=new HashMap<>();
	Map<Integer,AccountDet>  adminMap=new HashMap<>();
	Map<Integer,ArrayList<Integer>> listMap=new HashMap<>();
	static Map<Integer,ArrayList<TransactionPojo>>  trans=new HashMap<>();
    Map<Integer,LoanPojo> loanMap=new HashMap<>();
	
	private int accId=3000;
	private int cusId=5000;
	int initialAmount=1000;
	public int accId1=1;
	private String pass="name@12345";
	public int getAccountId()
	{
	   return accId++;
	}
	public int getCustomerId()
	{
		return cusId++;
	}
	
	public BankCache()
	{
		AccountDet account=new AccountDet();
		account.setRoleID(accId1);
		account.setPassword(pass);
		accountMap.put(getCustomerId(), account);
	}
	public void emptyCheck(String value) throws CustomException
	{

		if(value.isEmpty() || value == null)
			 throw new CustomException("String cant be empty");
	}
	
	public String  loginMethod(int userId,String pass) throws CustomException,AccountException
	{
		emptyCheck(pass);
		int id=userCredentials(userId,pass);
		if(id == 1)
		{
			return "Admin";
		}
		else if(id == 2)
		{
			return "Customer";
		} 
		
		return "Enter the correct username and password";
	}
	
	public String addCustomerDetails(CustomerDet custom) throws CustomException
	{
	 if(custom != null)
	 {
		custom.setCusId(cusId);
		custom.setUserName(cusId);
		customMap.put(getCustomerId(), custom);
		//System.out.println(customMap);
	 }
		System.out.println("Customer Added Successfully ");
		return "Your customer Id : "+cusId;
	    
	}
	
	public int  userCredentials(int userId,String password) throws CustomException,AccountException
	{
		emptyCheck(password);
		CustomerDet custom=customMap.get(userId);
		AccountDet admin=new AccountDet();
		if(userId == admin.getRoleID() && password.equals(admin.getPassword()))
		{
			return 1;
		}
		else if(custom.getCusId() == userId && password.equals(custom.getPassword()))
		{
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public CustomerDet getCustomerDetails(int customerId) throws CustomException
	{
		if(customMap == null)
		{
			System.out.println("the customMap in get Customer details are empty ");
			return customMap.get(customerId);
		}
		CustomerDet res=customMap.get(customerId);
		
		return res;
	}
	
	public Map<Integer,CustomerDet> allCustomerDetails() throws CustomException
	{
		if(customMap == null)
			{
			System.out.println("the customMap is empty");
			return customMap;
			}
		
		return customMap;
	}
	
	
	
	public String addAccountDetails(AccountDet acc) throws CustomException
	{
		if(accountMap == null)
		{
			//System.out.println("the accountMap is empty");
			return "the accountMap is empty";
		}
		ArrayList<Integer> list=new ArrayList<>();
		int accountId=getAccountId();
		accountMap.put(accountId, acc);
		acc.setAccId(accountId);
		list.add(accountId);
		listMap.put(acc.getCusId(), list);
		//System.out.println("Account Id added Successfully ");
		return "Your accountId is " +accountId;
	}
	public AccountDet getAccountDetails(int accId) throws CustomException
	{
		if(accountMap == null )
		{
			System.out.println("the the accountMap is empty");
			return accountMap.get(accId);
		}
		
		return accountMap.get(accId);
	}
	
	public void amountDeposit(int accountId,double bal,int customerId) throws CustomException
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		LocalDate myObj = LocalDate.now(); 
		LocalTime myObj1 = LocalTime.now();
		TransactionPojo hist=new TransactionPojo();
		ArrayList<TransactionPojo> list=new ArrayList<>();
		if(accountMap.containsKey(accountId))
		{
		AccountDet account=accountMap.get(accountId);
		double bal1=0;
		if(account != null)
		{
		bal1=account.getBalance();
		bal1+=bal;
		account.setBalance(bal1);
		hist.setDeposit(bal);
		hist.setAccId(accountId);
		hist.setBal(bal1);
		hist.setDate(myObj);
		hist.setTime(myObj1);
		String val="money has been deposited"+ accountId+"at "+ myObj +" cuurent balance is "+ bal1;
		hist.setComments(val);
		list.add(hist);
		
		trans.put(customerId,list);
		accountMap.put(accountId, account);
		//System.out.println("the trans is "+ trans);
		System.out.println("Amount Deposited Successfully"); 
		}}
		
	}
		

		
	
	
	public void withdrawlAmount(int accountId,double bal,int customerId) throws CustomException
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		LocalDate myObj = LocalDate.now(); 
		LocalTime myObj1 = LocalTime.now();
		TransactionPojo hist=new TransactionPojo();
		ArrayList<TransactionPojo> listtype=trans.get(customerId);
		
		if(listtype == null)
		{
			listtype=new ArrayList<TransactionPojo>();
		
          trans.put(customerId, listtype);
	
	     }
		else if(accountMap.containsKey(accountId))
		{
		AccountDet account=accountMap.get(accountId);
		double balance=account.getBalance();
		
		if(balance != 0 && balance > initialAmount && bal > initialAmount )
		{
			balance -=bal;
			hist.setBal(balance);
			hist.setWithdrawn(bal);
			hist.setAccId(accountId);
			hist.setCusId(customerId);
			hist.setDate(myObj);
			hist.setTime(myObj1);
			String val="your money has been withdrawn "+ accountId + " at "+ myObj +  " currentBalance is "+balance;
			hist.setComments(val);
			listtype.add(hist);
			
			account.setBalance(balance);
			
		
			trans.put(customerId, listtype);
			
		
		}
		
		
		accountMap.put(accountId, account);
		System.out.println("Amount withdrawn in your acount successfully ");
		}
	}
	
	public double balanceEnquiry(int accountId) throws CustomException
	{
		if(accountMap == null)
		{
			System.out.println("the account Map is empty");
			return 0;
		}
		    double bal=0;
			AccountDet accountdet=accountMap.get(accountId);
			if(accountdet != null)
			{
			bal=accountdet.getBalance();
			}
			else {
				return 0;
			}
			return bal;
	}
	
	
	public void customerAccountDetails(int cusId) throws CustomException
	{
		if(listMap== null)
		{
			System.out.println("the account Map is empty");
			return ;
		}
		ArrayList<Integer> listInteger=listMap.get(cusId);
		AccountDet accountDetails=new AccountDet();
		for(int i=0;i<listInteger.size();i++)
		{
			accountDetails=accountMap.get(listInteger.get(i));
			System.out.println("the customer Account details are "+ cusId+ "accounts are"+accountDetails);
		}
		
		
	}
	public double allAccountsBalance(int cusId) throws CustomException
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return 0;
		}
		double bal=0;
		ArrayList<Integer> list1=listMap.get(cusId);
		for(int i=0;i<list1.size();i++)
		{
		 AccountDet acc =accountMap.get(list1.get(i));
		 bal+=acc.getBalance();
		}
		//System.out.println("The total amount in your all accounts is "+ bal);
		
		return bal;
		
	}
	
	public int openAccountInBank(CustomerDet customDet,AccountDet accountDet)  throws CustomException
	{
		if(accountMap== null || customMap == null)
		{
			System.out.println("your Id  is not presence in the list");
			return 0;
		}
		int id=getCustomerId();
		customMap.put(id, customDet);
		accountDet.setCusId(id);
		int accountId=getAccountId();
		accountMap.put(accountId, accountDet);
		System.out.println("Account opened successfully ");
		return accountId;
	}
	
	public CustomerDet loanAmount(int customerId,int accountId,String type,LoanPojo loan) throws CustomException
	{
		emptyCheck(type);
		String val=type;
		CustomerDet custom=null;
		 if(customMap!= null && val.equals("yes"))
		 {	
			 custom=customMap.get(customerId);
		 
			if(custom != null && accountMap.containsKey(accountId))
			{
			  int n=loan.getLoanNumber();	
			 switch(n)
			 {
			 case 1:loan.setNumberOfLoanApplicable("your id " + customerId + " is applicable for the loan  Educational Loan ");
			 break;
			 case 2:loan.setNumberOfLoanApplicable("your id " + customerId + " is applicable for the loan  personal Loan ");
			 break;
			 case 3:loan.setNumberOfLoanApplicable("your id " + customerId + " is applicable for the loan  Bussiness Loan ");
			 break;
			 case 4:loan.setNumberOfLoanApplicable("your id " + customerId + " is applicable for the loan  Car Loan ");
			 break;
			 case 5:loan.setNumberOfLoanApplicable("your id " + customerId + " is applicable for the loan  Medical Loan ");
			 break;
			 }

			   loan.setCusId(customerId);
			   loan.setAccId(accountId);
			   loan.setConfirmation("Applied Loan ");
			   loan.setBalance(100000);
			   loanMap.put(accountId, loan);
				custom.setLoanApproval("Loan Applied");    
			    System.out.println("your  loan has been sent to bank for approval");
			   // System.out.println(loan);
		  
		    }
		}
		else if(val.equals("no")){
			System.out.println("Loan is not approved ");
		}
		return custom;
		
	}
	
	public   ArrayList<TransactionPojo>  getTransactionDetails(int customerId) throws CustomException
	{
		if(trans ==null)	
		{
			System.out.println(" details are not Entered");
		}
		
      ArrayList<TransactionPojo> listtype=trans.get(customerId);
		
		if(listtype == null)
		{
			listtype=new ArrayList<TransactionPojo>();
		
          trans.put(customerId, listtype);
	
	     }
		trans.put(customerId, listtype);
		return listtype;
	}
	
	
	public Map<Integer, AccountDet> adminHandleAllAccounts() throws CustomException
	{
		if(accountMap==null)
		{
			System.out.println("the accounts are empty");
		   return accountMap;
		}
		return accountMap;
		
	}
	
	public AccountDet adminLoanHandle(int accountId,String val) throws CustomException
	{
		if(accountMap==null || listMap != null)
		{
			System.out.println("The details are empty");
			return accountMap.get(accountId);
		}
		
		AccountDet account=null;
		LoanPojo loan1=loanMap.get(accountId);
		if(loan1 != null)
		{
		int id=loan1.getCusId();
		CustomerDet custom=customMap.get(id);
		account=accountMap.get(accountId);
		if(custom.getLoanApproval().equals(val))
		{
		
		account.setLoanstatus(val);
		}
		}
		
		return account;
	}
	
	public LoanPojo loanAppliedstatus(int accountId) throws CustomException
	{
		LoanPojo loanHelp = null;
		if(loanMap != null)
		{
			loanHelp=loanMap.get(accountId);
		}
		return loanHelp;
	}
	
	public AccountDet amountDepositForAdmin(int accountId,double bal) throws CustomException
	{
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return accountMap.get(accountId);
		}
			LocalDate myObj = LocalDate.now(); 
			LocalTime myObj1 = LocalTime.now();
			TransactionPojo hist=new TransactionPojo();
			ArrayList<TransactionPojo> list=new ArrayList<>();
			if(accountMap.containsKey(accountId))
			{
			AccountDet account=accountMap.get(accountId);
			double bal1=0;
			if(account != null)
			{
			bal1=account.getBalance();
			bal1+=bal;
			account.setBalance(bal1);
			hist.setDeposit(bal);
			hist.setAccId(accountId);
			hist.setBal(bal1);
			hist.setDate(myObj);
			hist.setTime(myObj1);
			String val="money has been deposited"+ accountId+"at "+ myObj +" cuurent balance is "+ bal1;
			hist.setComments(val);
			list.add(hist);
			}
			trans.put(account.getCusId(),list);
			accountMap.put(accountId, account);
			
			System.out.println("Amount Deposited in this account Successfully by admin "); }
			return accountMap.get(accountId);
	}
	
	public AccountDet amountWithdrawnbyAdmin(int accountId,double bal) throws CustomException
	{
		
		if(accountMap== null)
		{
			System.out.println("the account Map is empty");
			return accountMap.get(accountId);
		}
		    LocalDate myObj = LocalDate.now(); 
		    LocalTime myObj1 = LocalTime.now();
			TransactionPojo hist=new TransactionPojo();
			ArrayList<TransactionPojo> list=new ArrayList<>();
			if(accountMap.containsKey(accountId))
			{
			AccountDet account=accountMap.get(accountId);
			double balance=account.getBalance();
			
			if(balance != 0 && balance > initialAmount && bal > initialAmount )
			{
				balance -=bal;
				hist.setBal(balance);
				hist.setWithdrawn(bal);
				hist.setAccId(accountId);
				hist.setCusId(account.getCusId());
				hist.setDate(myObj);
				hist.setTime(myObj1);
				String val="your money has been withdrawn "+ accountId + " at "+ myObj +  " currentBalance is "+balance;
				hist.setComments(val);
				list.add(hist);
				
				account.setBalance(balance);
				trans.put(account.getCusId(), list);
			}
			
			accountMap.put(accountId, account);
			System.out.println("Amount withdrawn in this account  successfully by admin ");
			}
		
		return accountMap.get(accountId);
	}
	
	
	
	public Map<Integer,ArrayList<TransactionPojo>> adminTransactionHistory() throws CustomException
	{
		if(trans == null)
		{
			System.out.println("the trans Map is empty");
			return trans;
		}
		return trans;
	}
	
	
}