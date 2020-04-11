package kcp.springTxMgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import kcp.springTxMgmt.service.BankServiceMgnt;

@SpringBootApplication
public class TxMgmtDecleApproachTest {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		BankServiceMgnt serviceMgnt;
		context =SpringApplication.run(TxMgmtDecleApproachTest.class, args);
		serviceMgnt = context.getBean("service", BankServiceMgnt.class);
		try {
			System.out.println(serviceMgnt.transferMoneyToBank(100, 102, 10000));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
