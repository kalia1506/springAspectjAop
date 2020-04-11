package kcp.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import kcp.springAOP.cfgs.Appconfig;
import kcp.springAOP.service.BankLoanApproval;

public class BeforeAdviceTest {

	private static final String path = "kcp/springAOP/cfgs/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		BankLoanApproval proxy;
		context=new AnnotationConfigApplicationContext(Appconfig.class);
		proxy=context.getBean("approve",BankLoanApproval.class);
		System.out.println("  "+proxy.approval(123456, "goldloan", 3000000));
		System.out.println("******************************");
	}

}
