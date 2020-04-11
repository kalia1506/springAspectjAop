package kcp.springAOP.ownException;

public class InvalidCredentialsException extends Throwable {
	public InvalidCredentialsException(String msg) {
		super(msg);
	}
}
