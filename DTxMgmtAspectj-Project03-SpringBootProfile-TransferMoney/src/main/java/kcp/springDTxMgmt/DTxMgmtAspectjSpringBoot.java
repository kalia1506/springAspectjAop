package kcp.springDTxMgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import kcp.springDTxMgmt.service.BankService;

@SpringBootApplication
public class DTxMgmtAspectjSpringBoot {

	public static void main(String[] args) {
		ApplicationContext context;
		BankService serviceMgnt;
		context=SpringApplication.run(DTxMgmtAspectjSpringBoot.class, args);
		serviceMgnt = context.getBean("bankservice", BankService.class);
		System.out.println(serviceMgnt.transferMoney(100, 102, 10000));
	
	}

}
