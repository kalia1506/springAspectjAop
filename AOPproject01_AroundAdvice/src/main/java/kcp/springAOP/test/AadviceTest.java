package kcp.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.springAOP.service.BankServiceMgmt;

public class AadviceTest {

	private static String path = "kcp/springAOP/configuration/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		BankServiceMgmt serviceMgmt;
		context = new ClassPathXmlApplicationContext(path);
		serviceMgmt = context.getBean("pfb", BankServiceMgmt.class);
		System.out.println(" compoundInterest:::  " + serviceMgmt.calcCompoundInterest(1000, 2, 10));
		System.out.println();
		System.out.println();
		System.out.println(" compoundInterest:::  " + serviceMgmt.calcCompoundInterest(1000, 2, 10));
		System.out.println("-----------------------------------------------");
		System.out.println(" simpleInterest::  " + serviceMgmt.calcSimpleInterest(200000, 3, 12));
		System.out.println(serviceMgmt.getClass());
	}

}
