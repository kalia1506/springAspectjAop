package kcp.springDTxMgmt.dao;

public interface WithdrawDAO {
	int withdraw(long accNo, double amount);
}
