package kcp.springAOP.customEX;

public class InvalidAmountException extends Exception {
	public InvalidAmountException(Exception ex) {
		super(ex);
	}
}
