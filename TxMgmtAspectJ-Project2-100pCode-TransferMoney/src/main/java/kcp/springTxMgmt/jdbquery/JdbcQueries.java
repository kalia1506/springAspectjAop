package kcp.springTxMgmt.jdbquery;

public interface JdbcQueries {
	String WITHDRAW_QUERY  = "UPDATE BANK_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";
	String DEPOSITE_QUERY = "UPDATE BANK_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?";

}
