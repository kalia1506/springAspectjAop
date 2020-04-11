package kcp.springTxMgmt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.springTxMgmt.sevice.BankServiceMgnt;

public class TxMgmtDecleApproachTest {

	private static String path = "kcp/springTxMgmt/cfgs/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		BankServiceMgnt serviceMgnt;
		context = new ClassPathXmlApplicationContext(path);
		serviceMgnt = context.getBean("proxy", BankServiceMgnt.class);
		try {
			System.out.println(serviceMgnt.transferMoneyToBank(100, 102, 10000));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
