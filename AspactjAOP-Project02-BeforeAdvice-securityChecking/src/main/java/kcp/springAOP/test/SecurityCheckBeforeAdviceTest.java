package kcp.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.springAOP.ownException.InvalidCredentialsException;
import kcp.springAOP.service.AuthonthicationmgmtService;
import kcp.springAOP.service.BankServiceMgmt;

public class SecurityCheckBeforeAdviceTest {
	private static final String path = "kcp/springAOP/cfgs/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args)  {
		ApplicationContext context;
		BankServiceMgmt serviceMgmt;
		AuthonthicationmgmtService authService;
		context = new ClassPathXmlApplicationContext(path);
		authService = context.getBean("AuthService", AuthonthicationmgmtService.class);
		serviceMgmt = context.getBean("bankservice", BankServiceMgmt.class);
		try {
			authService.signIn("kalia", "kalia");
			System.out.println();
			System.out.println(serviceMgmt.deposite(1234567891, 20000));
			System.out.println();
			System.out.println(serviceMgmt.withdraw(1234567891, 5000));
			System.out.println();
			authService.signOut();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
