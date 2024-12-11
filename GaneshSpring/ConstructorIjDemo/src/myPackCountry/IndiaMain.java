package myPackCountry;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class IndiaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx = new ClassPathXmlApplicationContext("Bharat.xml");
		
		India in = (India) ctx.getBean("indiaBean");
		//System.out.println("India Info....."+in);
		
		UnionTerritories ut = (UnionTerritories) ctx.getBean("utBean");
		//System.out.println("UnionTerritories Info........ "+ ut);
		
		System.out.println("Area of India: "+in.getArea());
		System.out.println("Capital of India: "+in.getCapital());
		System.out.println("No of States in India: "+in.getNoOfState());
		System.out.println("No of Unionterritories in India: "+ut.getNoofUT());
		
	}

}


