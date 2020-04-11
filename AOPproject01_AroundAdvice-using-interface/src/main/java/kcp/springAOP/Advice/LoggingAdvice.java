package kcp.springAOP.Advice;

import java.util.Arrays;
import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggingAdvice implements MethodInterceptor {
	private static Logger logger = Logger.getLogger(LoggingAdvice.class);

	public LoggingAdvice() {
		PropertyConfigurator.configure("src/main/java/kcp/springAOP/common/log.properties");
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal = null;
		System.out.println("Entering into"+invocation.getMethod().getName()
				+Arrays.toString(invocation.getArguments())+""+" at"+ new Date());
		retVal = invocation.proceed();
		System.out.println("Exited into"+invocation.getMethod().getName()
				+Arrays.toString(invocation.getArguments())+""+" at"+ new Date());
		return retVal;
	}

}
