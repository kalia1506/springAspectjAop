package kcp.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import kcp.springAOP.cfgs.AppConfiguration;
import kcp.springAOP.service.ShoppingStore;

public class AfterAdvice_AfterReturningTest {


	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		ShoppingStore store;
		context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		store=context.getBean("shop",ShoppingStore.class);
		String[] items=new String[]{"shirt","jeans","frize","tv"};
		double[] prices=new double[] {1200,400,3000,41000};
		System.out.println("billAmount"+store.generateBillAmount(items, prices));
	}

}
