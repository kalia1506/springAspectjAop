package kcp.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kcp.springAOP.cfgs.AppConfig;
import kcp.springAOP.service.ShoppingStore;

public class ThrowsAdvice_Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		ShoppingStore store;
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		store=context.getBean("shop",ShoppingStore.class);
		String[] items=new String[]{"shirt","jeans","frize","tv"};
		double[] prices=new double[] {10,400,3000,41000};
		System.out.println("billAmount"+store.generateBillAmount(items, prices));
	}

}
