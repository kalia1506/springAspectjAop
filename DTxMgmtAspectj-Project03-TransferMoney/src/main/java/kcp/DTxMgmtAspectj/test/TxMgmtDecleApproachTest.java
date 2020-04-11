package kcp.DTxMgmtAspectj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.DTxMgmtAspectj.service.BankService;


public class TxMgmtDecleApproachTest {

	private static String path = "kcp/DTxMgmtAspectj/cfgs/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		BankService serviceMgnt;
		context = new ClassPathXmlApplicationContext(path);
		serviceMgnt = context.getBean("bankservice", BankService.class);
			System.out.println(serviceMgnt.transferMoney(100, 132111, 10000));
	}

}
