package myPackSCC1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainList {
private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ctx = new ClassPathXmlApplicationContext("Ans.xml");
		
//		Question1 q1 = (Question1) ctx.getBean("obj1");
//		System.out.println(" "+q1.getAns());
//		
//		Answer an1 = (Answer) ctx.getBean("answer1");
//		System.out.println(an1.getId());
		Answer an2 = (Answer) ctx.getBean("answer2");
		System.out.println(an2.getBy());
	}


}
