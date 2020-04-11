package kcp.springAOP.Advice;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

import kcp.springAOP.ownException.InvalidCredentialsException;
import kcp.springAOP.service.AuthonthicationmgmtService;

public class SecurityCheckBeforeAdvice {
	private AuthonthicationmgmtService service;

	public SecurityCheckBeforeAdvice(AuthonthicationmgmtService service) {
		this.service = service;
	}

	public void security(JoinPoint joinPoint) throws Throwable {
		System.out.println("SecurityCheckBeforeAdvice.security()");
		System.out.println("METHOD NAME " + joinPoint.getSignature());
		System.out.println("METHOD ARGUMENTS:: " +Arrays.deepToString(joinPoint.getArgs()));
		if (!service.validate()) {
			throw new InvalidCredentialsException("invalid username/password");
		}
	}
}
