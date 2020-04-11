package kcp.springAOP.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import kcp.springAOP.service.BankServiceMgmt;

public class CalcSimpleInterestPonitCut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		if (method.getName().equalsIgnoreCase("calcSimpleInterest") &&
				targetClass==BankServiceMgmt.class) {
			return true;
		}
		return false;
	}
}
