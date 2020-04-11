package kcp.springTxMgmt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import kcp.springTxMgmt.jdbquery.JdbcQueries;

public class BankDAOImpl implements BankDAO {
	private JdbcTemplate jdbcTemplate;

	public BankDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int deposite(long account, double ammount) {
		System.out.println("BankDAOImpl.deposite()");
		return jdbcTemplate.update(JdbcQueries.DEPOSITE_QUERY,ammount,account);
	}

	@Override
	public int withdraws(long account, double ammount) {
		System.out.println("BankDAOImpl.withdraws()");
		return jdbcTemplate.update(JdbcQueries.WITHDRAW_QUERY,ammount,account);
	}

	@Override
	public int transferMoney(long sourceAcc, long longDestiAcc, double ammount) {
		System.out.println("BankDAOImpl.transferMoney()");
		return deposite(longDestiAcc, ammount)+withdraws(sourceAcc, ammount);
	}

}
