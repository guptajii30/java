package AOPPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		Transaction transaction=context.getBean("Transaction",Transaction.class);
		transaction.processTransaction();
		context.close();
	}
}
