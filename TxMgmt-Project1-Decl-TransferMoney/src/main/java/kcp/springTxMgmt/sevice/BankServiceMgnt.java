package kcp.springTxMgmt.sevice;

public interface BankServiceMgnt {
	String transferMoneyToBank(long sourceAcc, long longDestiAcc, double ammount) throws IllegalAccessException;
}
