package kcp.springAspectj.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("pmAdvice")
@Aspect
@Order(3)
public class ProformanceMoniteringAdvice {
	@Around("execution(* kcp.springAspectj.service.IDifferentAreaCalc.*(..))")
	public Object monitering(ProceedingJoinPoint pJoinPoint) throws Throwable {
		System.out.println("ProformanceMoniteringAdvice.monitering()");
		System.out.println("METHOD NAME:: " + pJoinPoint.getSignature().getName());
		System.out.println("METHOD ARGUMENTS:: " + Arrays.toString(pJoinPoint.getArgs()));
		long start = 0, end = 0;
		Object retVal = null;
		start = System.currentTimeMillis();
		retVal = pJoinPoint.proceed();
		end = System.currentTimeMillis();
		System.out.println("TOTAL PERFPRMANCE TIME IS== " + (end - start) + " ms");
		return retVal;

	}
}
