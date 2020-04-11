package kcp.springAOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.springAOP.service.ShoppingStore;

public class ThrowsAdvice_Test {

	private static final String path = "kcp/springAOP/cfgs/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		ShoppingStore store;
		context = new ClassPathXmlApplicationContext(path);
		store=context.getBean("shop",ShoppingStore.class);
		String[] items=new String[]{"shirt","jeans","frize","tv"};
		double[] prices=new double[] {10,400,3000,41000};
		System.out.println("billAmount"+store.generateBillAmount(items, prices));
	}

}
