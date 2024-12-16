package myPack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDependancyInjection {
	
	public static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("Constructor.xml");
		
		GreetingDemo demo  = (GreetingDemo) ctx.getBean("bean1");
		
		System.out.println(demo.getGreet());
	}

}
