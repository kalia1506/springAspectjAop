package kcp.springTxMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kcp.springTxMgmt.dao.BankDAO;
@Service("bankservice")
public class BankServiceMgntImpl implements BankServiceMgnt {
	@Autowired
	private BankDAO dao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED,readOnly = false,timeout = 5,rollbackFor =IllegalAccessException.class )
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
