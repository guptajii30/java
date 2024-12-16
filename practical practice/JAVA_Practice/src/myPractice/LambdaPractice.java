package myPractice;
import java.util.Scanner;

interface Convertor{
	double convert(double input);
}

public class LambdaPractice {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		
		Convertor fToc = (fahrenheit) -> (fahrenheit-32)*5/9;
		Convertor cTof = (Celsius) -> (Celsius*9/5)+32;
		
		Convertor KilometerToMiles = (Kilometer) -> (Kilometer*0.623171);
		
		System.out.println("Enter Temprature in Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		double Celsius = fToc.convert(fahrenheit);
		System.out.println(fahrenheit+" Fahrenheit: "+Celsius+" Celsius");
		
		System.out.println("Enter Temprature in Celsius: ");
		double Celsius1 = sc.nextDouble();
		double fahrenheit1 =cTof.convert(Celsius1);
		System.out.println(Celsius1+"Celsius: "+fahrenheit1+" Fahrenheit");
		
		System.out.println("Enter the Distance in Kilometer: ");
		double kilometer = sc.nextDouble();
		double miles = KilometerToMiles.convert(kilometer);
		System.out.println(kilometer+"Kilometer: "+miles+" Miles");
	}
}
