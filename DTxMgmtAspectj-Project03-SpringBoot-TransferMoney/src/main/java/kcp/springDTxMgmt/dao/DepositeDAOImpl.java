package kcp.springDTxMgmt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kcp.springDTxMgmt.JdbcQueries.JdbcQueries;


@Repository("DepositeDAO")
public class DepositeDAOImpl implements DepositeDAO {
	@Autowired
	@Qualifier("oracleJt")
	private JdbcTemplate oracleJt;

	@Override
	public int deposite(long accNo, double amount) {
		return oracleJt.update(JdbcQueries.DEPOSITE_QUERY,amount,accNo);
	}

}
