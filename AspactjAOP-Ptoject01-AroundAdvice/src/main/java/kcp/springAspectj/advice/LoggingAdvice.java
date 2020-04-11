package kcp.springAspectj.advice;

import java.util.Arrays;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAdvice {
	private static Logger logger = Logger.getLogger(LoggingAdvice.class);
	static {
		PropertyConfigurator.configure("src/main/java/kcp/Aspectj/commons/log4j.properties");
	}

	public Object logging(ProceedingJoinPoint pJoinPoint) throws Throwable {
		System.out.println("LoggingAdvice.logging()");
		logger.warn("Entering into METHOD NAME:: " + pJoinPoint.getSignature() + " and ARGUMENTS:: "
				+ Arrays.toString(pJoinPoint.getArgs()) + "at " + new Date());
		Object retVal = null;
		retVal = pJoinPoint.proceed();
		logger.warn("Exits into METHOD NAME:: " + pJoinPoint.getSignature() + " and ARGUMENTS:: "
				+ Arrays.toString(pJoinPoint.getArgs()) + "at " + new Date());
		return retVal;

	}
}
