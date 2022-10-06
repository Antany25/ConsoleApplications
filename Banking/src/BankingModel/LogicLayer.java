package BankingModel;

import java.util.ArrayList;
import java.util.Map;

import javax.security.auth.login.AccountException;

import BankingController.BankCache;


public class LogicLayer {

	static BankCache cache=new  BankCache();
	
	
	public String loginPasswords(int userId,String pass) throws Exception 
	{
		return  cache.loginMethod(userId, pass);
	}
	  
	 
	public String addCustomerDetails(CustomerDet custom) throws Exception
	{
		return cache.addCustomerDetails(custom);
	}
	
	public CustomerDet getCustomerDetails(int cusId) throws Exception
	{
		return cache.getCustomerDetails(cusId);
	}
	
	public String addAccountDetails(AccountDet acc) throws Exception
	{
		return cache.addAccountDetails(acc);
	}
	public AccountDet getAccountDetails(int accId) throws Exception
	{
		return cache.getAccountDetails(accId);
	}
	public int openAccountsCustomer(CustomerDet customDet,AccountDet accountDet) throws Exception
	{
		return cache.openAccountInBank(customDet,accountDet);
	}
	public double allAccountsSumMoney(int cusId) throws Exception
	{
		return cache.allAccountsBalance(cusId);
	}

	public void transferMoney(int accId,double balance,int accId1,int cusId,int cusId1) throws Exception
	{
		cache.withdrawlAmount(accId, balance,cusId);
		cache.amountDeposit(accId1, balance,cusId1);
	}
	public double balanceEnquiryDetails(int accId) throws Exception
	{
		return cache.balanceEnquiry(accId);
	}
	public void getCustomerAllAccounts(int cusId) throws Exception
	{
		cache.customerAccountDetails(cusId);
	}
	public LoanPojo loanStatusSeeking(int accountId) throws Exception
	{
		return cache.loanAppliedstatus(accountId);
	}
	
	public CustomerDet loanForCustomers(int cusid,int accId,String type,LoanPojo loan) throws Exception
	{
		return cache.loanAmount(cusid, accId, type, loan);
	}
	
	public   ArrayList<TransactionPojo> transactionListDetails(int customerId) throws Exception
	{
		return cache.getTransactionDetails(customerId);
	}
	
	
	public Map<Integer,AccountDet> adminHandlesAllaccount() throws Exception
	{
		return cache.adminHandleAllAccounts();
	}
	
    public AccountDet adminLoanApprooved(int accId,String val) throws Exception
    {
    	return cache.adminLoanHandle(accId,val);
    }
	
	public AccountDet adminTransferDeposit(int accountId,double balance) throws Exception
	{
		return cache.amountDepositForAdmin(accountId, balance);
				
	}
	
	public AccountDet adminTransferWithdrawn(int accountId,double balance) throws Exception
	{
		return cache.amountWithdrawnbyAdmin(accountId, balance);
	}
	
	public Map<Integer,ArrayList<TransactionPojo>> adminHistoryCheck() throws Exception
	{
		return cache.adminTransactionHistory();
	}
	
	public Map<Integer,CustomerDet> allCustomerDetails() throws Exception
	{
		return cache.allCustomerDetails();
	}
	


}