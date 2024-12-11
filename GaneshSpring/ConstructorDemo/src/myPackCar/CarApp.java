package myPackCar;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext; 

public class CarApp {

	public static void main(String[] args) {

			// TODO Auto-generated method stub
			ApplicationContext ctx = new ClassPathXmlApplicationContext("Car.xml");
			Car car = (Car) ctx.getBean("carBean");
			System.out.println(car);
		}
}
