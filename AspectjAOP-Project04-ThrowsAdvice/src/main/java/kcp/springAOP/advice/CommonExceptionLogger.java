package kcp.springAOP.advice;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;

import kcp.springAOP.customEX.InvalidAmountException;


public class CommonExceptionLogger {
	private static Logger logger = Logger.getLogger(CommonExceptionLogger.class);
	static {
		PropertyConfigurator.configure("src/main/java/kcp/Aspectj/commons/log4j.properties");
	}

	@SuppressWarnings("resource")
	public void exceptionLogger(JoinPoint joinPoint, Exception ex) throws Throwable {
		logger.fatal(ex.toString() + " exception is raised in" + joinPoint.getSignature() + " with args"
				+ Arrays.deepToString(joinPoint.getArgs()));
		throw new InvalidAmountException(ex);
	}
}
