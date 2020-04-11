package kcp.springAOP.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import kcp.springAOP.Query.JdbcQueries;
import kcp.springAOP.bo.UserBO;

public class AuthonthicationDAOImpl implements AuthonthicationDAO {
	private JdbcTemplate jdbcTemplate;

	public AuthonthicationDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int authenicationCheck(UserBO bo) throws Exception {
		System.out.println("AuthonthicationDAOImpl.authenicationCheck()");
		String un = bo.getUserName();
		String pwd = bo.getPassword();
		System.out.println(un+" "+pwd);
		return jdbcTemplate.queryForObject(JdbcQueries.AUTH_CHECK, Integer.class, un, pwd);
	}

}
