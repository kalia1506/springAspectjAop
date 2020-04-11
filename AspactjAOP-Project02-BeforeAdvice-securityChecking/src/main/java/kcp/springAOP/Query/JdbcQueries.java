package kcp.springAOP.Query;

public interface JdbcQueries {
	String WITHDRAW_QUERY  = "UPDATE BANK_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";
	String DEPOSITE_QUERY = "UPDATE BANK_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?";
	String AUTH_CHECK="select count(*) from userlist where username=? and password=?";

}
