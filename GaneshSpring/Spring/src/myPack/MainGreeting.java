package myPack;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainGreeting {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//Dependency injection by Setter method
				ApplicationContext ctx = new ClassPathXmlApplicationContext("greeting.xml");
				
				Greeting greetObj = (Greeting) ctx.getBean("greet");
				System.out.println("Dependancy Injection "+greetObj);
	}

}
