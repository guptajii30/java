package myPack1;

public class GreetingDemo {
	String greet;

	public GreetingDemo() {
		super();
	}

	public GreetingDemo(String greet) {
		super();
		this.greet = greet;
	}

	public String getGreet() {
		return greet;
	}

	public void setGreet(String greet) {
		this.greet = greet;
	}

	@Override
	public String toString() {
		return "GreetingDemo [greet=" + greet + "]";
	}
	
	
}
