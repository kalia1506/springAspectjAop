package kcp.springTxMgmt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.springTxMgmt.config.AppConfig;
import kcp.springTxMgmt.service.BankServiceMgnt;


public class TxMgmtDecleApproachTest {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		BankServiceMgnt serviceMgnt;
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		serviceMgnt = context.getBean("bankservice", BankServiceMgnt.class);
		try {
			System.out.println(serviceMgnt.transferMoneyToBank(100, 108, 10000));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
