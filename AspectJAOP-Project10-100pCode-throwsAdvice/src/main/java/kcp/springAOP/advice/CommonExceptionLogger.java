package kcp.springAOP.advice;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import kcp.springAOP.customEX.InvalidAmountException;

@Component
@Aspect
public class CommonExceptionLogger {
	private static Logger logger = Logger.getLogger(CommonExceptionLogger.class);
	static {
		PropertyConfigurator.configure("src/main/java/kcp/Aspectj/commons/log4j.properties");
	}

	@SuppressWarnings("resource")
	@AfterThrowing(pointcut = "execution(* kcp.springAOP.service.*.*(..))",throwing = "ex")
	public void exceptionLogger(JoinPoint joinPoint, Exception ex) throws Throwable {
		logger.fatal(ex.toString() + " exception is raised in" + joinPoint.getSignature() + " with args"
				+ Arrays.deepToString(joinPoint.getArgs()));
		throw new InvalidAmountException(ex.toString());
	}
}
