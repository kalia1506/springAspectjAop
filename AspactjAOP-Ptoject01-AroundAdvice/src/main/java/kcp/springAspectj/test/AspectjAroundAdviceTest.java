package kcp.springAspectj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kcp.springAspectj.service.DifferentAreaCalc;
import kcp.springAspectj.service.IDifferentAreaCalc;

public class AspectjAroundAdviceTest {
	private static String path="kcp/springAspectj/cfgs/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		IDifferentAreaCalc proxy;
		context=new ClassPathXmlApplicationContext(path);
		proxy=context.getBean("area",IDifferentAreaCalc.class);
		System.out.println("Area:: "+proxy.CircleArea(10));
		System.out.println();
		
		System.out.println("peremeter:: "+proxy.CircleParameter(10));
		System.out.println();
		System.out.println("peremeter:: "+proxy.CircleParameter(10));
		System.out.println();
		System.out.println("sub class= "+proxy.getClass());
		System.out.println("superClass=  "+proxy.getClass().getSuperclass());
	}
}
