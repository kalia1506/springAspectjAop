package kcp.springDTxMgmt.service;

public interface BankService {
String transferMoney(long sourceAccount, long destiAcc,double amount);
}
