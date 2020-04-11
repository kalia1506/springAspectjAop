package kcp.springAOP.service;

public interface BankServiceMgmt {
	public String withdraw(long accountNo, double amount) throws Exception;

	public String deposite(long accountNo, double amount) throws Exception;
}
