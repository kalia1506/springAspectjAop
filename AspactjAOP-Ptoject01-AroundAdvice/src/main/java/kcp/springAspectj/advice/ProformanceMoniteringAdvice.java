package kcp.springAspectj.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProformanceMoniteringAdvice {
	public Object monitering(ProceedingJoinPoint pJoinPoint) throws Throwable {
		System.out.println("ProformanceMoniteringAdvice.monitering()");
		System.out.println("METHOD NAME:: " + pJoinPoint.getSignature().getName());
		System.out.println("METHOD ARGUMENTS:: " +Arrays.toString(pJoinPoint.getArgs()));
		long start = 0, end = 0;
		Object retVal = null;
		start = System.currentTimeMillis();
		retVal = pJoinPoint.proceed();
		end = System.currentTimeMillis();
		System.out.println("TOTAL PERFPRMANCE TIME IS== " + (end - start) + " ms");
		return retVal;

	}
}
