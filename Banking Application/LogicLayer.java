package Banking;

import java.util.ArrayList;
import java.util.Map;

import javax.security.auth.login.AccountException;


public class LogicLayer {

	static BankCache cache=new  BankCache();
	
	
	public String loginPasswords(int userId,String pass) throws CustomException, AccountException  
	{
		return  cache.loginMethod(userId, pass);
	}
	  
	 
	public String addCustomerDetails(CustomerDet custom) throws CustomException
	{
		return cache.addCustomerDetails(custom);
	}
	
	public CustomerDet getCustomerDetails(int cusId) throws CustomException
	{
		return cache.getCustomerDetails(cusId);
	}
	
	public String addAccountDetails(AccountDet acc) throws CustomException
	{
		return cache.addAccountDetails(acc);
	}
	public AccountDet getAccountDetails(int accId) throws CustomException
	{
		return cache.getAccountDetails(accId);
	}
	public int openAccountsCustomer(CustomerDet customDet,AccountDet accountDet) throws CustomException
	{
		return cache.openAccountInBank(customDet,accountDet);
	}
	public double allAccountsSumMoney(int cusId) throws CustomException
	{
		return cache.allAccountsBalance(cusId);
	}

	public void transferMoney(int accId,double balance,int accId1,int cusId,int cusId1) throws CustomException
	{
		cache.withdrawlAmount(accId, balance,cusId);
		cache.amountDeposit(accId1, balance,cusId1);
	}
	public double balanceEnquiryDetails(int accId) throws CustomException
	{
		return cache.balanceEnquiry(accId);
	}
	public void getCustomerAllAccounts(int cusId) throws CustomException
	{
		cache.customerAccountDetails(cusId);
	}
	public LoanPojo loanStatusSeeking(int accountId) throws CustomException
	{
		return cache.loanAppliedstatus(accountId);
	}
	
	public CustomerDet loanForCustomers(int cusid,int accId,String type,LoanPojo loan) throws CustomException
	{
		return cache.loanAmount(cusid, accId, type, loan);
	}
	
	public   ArrayList<TransactionPojo> transactionListDetails(int customerId) throws CustomException
	{
		return cache.getTransactionDetails(customerId);
	}
	
	
	public Map<Integer,AccountDet> adminHandlesAllaccount() throws CustomException
	{
		return cache.adminHandleAllAccounts();
	}
	
    public AccountDet adminLoanApprooved(int accId,String val) throws CustomException
    {
    	return cache.adminLoanHandle(accId,val);
    }
	
	public AccountDet adminTransferDeposit(int accountId,double balance) throws CustomException
	{
		return cache.amountDepositForAdmin(accountId, balance);
				
	}
	
	public AccountDet adminTransferWithdrawn(int accountId,double balance) throws CustomException
	{
		return cache.amountWithdrawnbyAdmin(accountId, balance);
	}
	
	public Map<Integer,ArrayList<TransactionPojo>> adminHistoryCheck() throws CustomException
	{
		return cache.adminTransactionHistory();
	}
	
	public Map<Integer,CustomerDet> allCustomerDetails() throws CustomException
	{
		return cache.allCustomerDetails();
	}
	


}