package kcp.springAspectj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import kcp.springAspectj.cfgs.AppConfig;
import kcp.springAspectj.service.IDifferentAreaCalc;

public class AspectjAroundAdviceTest {
	private static String path="kcp/springAspectj/cfgs/applicationContext.xml";

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context;
		IDifferentAreaCalc proxy;
		context=new AnnotationConfigApplicationContext(AppConfig.class);
		proxy=context.getBean("area",IDifferentAreaCalc.class);
		System.out.println("Area:: "+proxy.CircleArea(10));
		System.out.println();
		System.out.println("Area:: "+proxy.CircleArea(10));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("peremeter:: "+proxy.CircleParameter(10));
		System.out.println();
		System.out.println("peremeter:: "+proxy.CircleParameter(10));
		System.out.println();
		System.out.println("sub class= "+proxy.getClass());
		System.out.println("superClass=  "+proxy.getClass().getSuperclass());
	}
}
