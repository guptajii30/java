package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingMain {
	public static ApplicationContext ctx;
	
	public static void main(String args []) {
		ctx = new ClassPathXmlApplicationContext("greet.xml");
		
		Greeting gree = (Greeting) ctx.getBean("bean1");
		
		System.out.println(gree.getGeet());
	}
}
