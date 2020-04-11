package kcp.springAOP.Advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
	Map<String, Object> cacheMap = new HashMap<String, Object>();
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key = invocation.getMethod().getName() + Arrays.toString(invocation.getArguments());
		Object retValue = null;
		if(!cacheMap.containsKey(key)) {
			System.out.println("from Method");
			retValue=invocation.proceed();
			cacheMap.put(key, retValue);
		}else {
			System.out.println("from cache");
			retValue=cacheMap.get(key);
		}
		return retValue;
	}

}
