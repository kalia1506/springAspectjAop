package kcp.DTxMgmtAspectj.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kcp.springTxMgmt.jdbquery.JdbcQueries;

@Repository("WithdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO {
	@Autowired
	@Qualifier("MySQLJt")
	private JdbcTemplate MySQLJt;

	@Override
	public int withdraw(long accNo, double amount) {
		return MySQLJt.update(JdbcQueries.WITHDRAW_QUERY,amount,accNo);
	}

}
