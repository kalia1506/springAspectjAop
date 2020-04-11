package kcp.AspectjAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import kcp.AspectjAOP.service.BankLoanApproval;


@SpringBootApplication
public class SpringBootBeforeAdviceApplication {

	public static void main(String[] args) {
		ApplicationContext context;
		BankLoanApproval proxy;
		context=SpringApplication.run(SpringBootBeforeAdviceApplication.class, args);
		proxy=context.getBean("approve",BankLoanApproval.class);
		System.out.println("  "+proxy.approval(123456, "goldloan", 3000000));
		System.out.println("******************************");
	}

}
