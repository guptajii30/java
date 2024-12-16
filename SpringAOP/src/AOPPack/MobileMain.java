package AOPPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Mobile.xml");
		Mobile m=context.getBean("Mobile",Mobile.class);
		String b=m.getBrand();
		System.out.println("Brand is"+b);
		context.close();
	}

}
