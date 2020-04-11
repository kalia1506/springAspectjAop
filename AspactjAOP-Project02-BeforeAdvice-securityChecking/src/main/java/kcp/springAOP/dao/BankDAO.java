package kcp.springAOP.dao;

public interface BankDAO {
	public int withdraw(long accountNo, double amount) throws Exception;

	public int deposite(long accountNo, double amount) throws Exception;
}
