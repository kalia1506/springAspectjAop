package kcp.springAspectj.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CachingAdvice {
	Map<String, Object> CacheMap = new HashMap<String, Object>();

	public Object cacheing(ProceedingJoinPoint pJoinPoint) throws Throwable {
		System.out.println("CachingAdvice.cacheing()");
		String key = pJoinPoint.getSignature()+Arrays.toString(pJoinPoint.getArgs());
		Object retVal = null;
		if (!CacheMap.containsKey(key)) {
			System.out.println("FROM METHOD");
			retVal=pJoinPoint.proceed();
			 CacheMap.put(key, retVal);
		} else {
			System.out.println("FROM CACHE");
			retVal = CacheMap.get(key);
		}
		return retVal;
	}
}
