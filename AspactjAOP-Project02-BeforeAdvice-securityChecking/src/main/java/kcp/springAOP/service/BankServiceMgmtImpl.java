package kcp.springAOP.service;

import kcp.springAOP.dao.BankDAO;

public class BankServiceMgmtImpl implements BankServiceMgmt {
	private BankDAO dao;

	public BankServiceMgmtImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public String withdraw(long accountNo, double amount) throws Exception {
		System.out.println("BankServiceMgmtImpl.withdraw()");
		int count = 0;
		count = dao.withdraw(accountNo, amount);
		if (count == 1) {
			return "withdraw successfully";
		} else {
			return "transaction failed";
		}
	}

	@Override
	public String deposite(long accountNo, double amount) throws Exception {
		System.out.println("BankServiceMgmtImpl.deposite()");
		int count=0;
		count=dao.deposite(accountNo, amount);
		if (count == 1) {
			return "deposite successfully";
		} else {
			return "transaction failed";
		}
	}

}
