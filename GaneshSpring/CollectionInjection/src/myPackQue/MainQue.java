package myPackQue;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Configue.xml");
		
		Question que = (Question) ctx.getBean("idBean");
		System.out.println(que.getId());
		System.out.println(que.getNm());
		System.out.println(que.getAns());
		
	}

}
