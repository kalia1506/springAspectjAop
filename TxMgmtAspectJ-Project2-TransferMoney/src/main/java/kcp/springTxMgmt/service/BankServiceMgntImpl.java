package kcp.springTxMgmt.service;

import kcp.springTxMgmt.dao.BankDAO;

public class BankServiceMgntImpl implements BankServiceMgnt {
	private BankDAO dao;

	public BankServiceMgntImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public String  transferMoneyToBank(long sourceAcc, long longDestiAcc, double ammount) throws IllegalAccessException {
		System.out.println("BankServiceMgntImpl.transferMoneyToBank()");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int count=dao.transferMoney(sourceAcc, longDestiAcc, ammount);
		if (count==2) {
			return " transfer is successfully";
		}else {
			//throw new RuntimeException("Transfer money  is rollback");
			throw new IllegalAccessException("Transfer monry  is rollback");
		}
		
	}

}
