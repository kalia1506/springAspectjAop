package kcp.springDTxMgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import kcp.springDTxMgmt.dao.DepositeDAO;
import kcp.springDTxMgmt.dao.WithdrawDAO;

@Service("bankservice")
public class BankServiceImpl implements BankService {
	@Autowired
	private WithdrawDAO wDao;
	@Autowired
	private DepositeDAO dDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String transferMoney(long sourceAccount, long destiAcc, double amount) {
		int result1=wDao.withdraw(sourceAccount, amount);
		int result2=dDao.deposite(destiAcc, amount);
		if (result1==1 && result2==1) {
			return "money transfer successfully";
		}else {
			throw new RuntimeException("money transfer rollback");
		}
		
	}

}
