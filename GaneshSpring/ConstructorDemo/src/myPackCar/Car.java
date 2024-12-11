package myPackCar;

public class Car {
	String nm;
	String model;
	int number;
	public Car(String nm, String model, int number) {
		super();
		this.nm = nm;
		this.model = model;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Car Info.......... [Name=" + nm + ", Model=" + model + ", Number=" + number + "]";
	}

}
