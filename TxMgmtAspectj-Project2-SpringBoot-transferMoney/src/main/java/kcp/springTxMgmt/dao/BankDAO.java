package kcp.springTxMgmt.dao;

public interface BankDAO {
	int deposite(long account, double ammount);

	int withdraws(long account, double ammount);

	int transferMoney(long sourceAcc, long longDestiAcc, double ammount);
}
