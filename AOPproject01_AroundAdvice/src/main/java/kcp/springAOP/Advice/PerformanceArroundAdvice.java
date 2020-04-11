package kcp.springAOP.Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceArroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		int StartTime = (int) System.currentTimeMillis();
		Object rateValue = invocation.proceed();
		int endTime = (int) System.currentTimeMillis();
		System.out.println("total perforamence is " + (endTime - StartTime) + " ms");
		return rateValue;
	}

}
