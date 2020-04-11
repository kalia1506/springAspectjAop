package kcp.springTxMgmt.service;

public interface BankServiceMgnt {
	String transferMoneyToBank(long sourceAcc, long longDestiAcc, double ammount) throws IllegalAccessException ;
}
