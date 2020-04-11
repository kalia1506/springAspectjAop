package kcp.springAOP.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import kcp.springAOP.Query.JdbcQueries;

public class BankDAOImpl implements BankDAO {
	private JdbcTemplate JdbcTemplate;

	public BankDAOImpl(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
		JdbcTemplate = jdbcTemplate;
	}

	@Override
	public int withdraw(long accountNo, double amount) throws Exception {
		System.out.println("BankDAOImpl.withdraw()");
		return JdbcTemplate.update(JdbcQueries.WITHDRAW_QUERY,amount,accountNo);
	}

	@Override
	public int deposite(long accountNo, double amount) throws Exception {
		System.out.println("BankDAOImpl.deposite()");
		return JdbcTemplate.update(JdbcQueries.DEPOSITE_QUERY,amount,accountNo);
	}

}
