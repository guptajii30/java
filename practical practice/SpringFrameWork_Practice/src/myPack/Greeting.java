package myPack;

public class Greeting {
	String geet;

	public Greeting() {
		super();
	}

	public Greeting(String geet) {
		super();
		this.geet = geet;
	}

	public String getGeet() {
		return geet;
	}

	public void setGeet(String geet) {
		this.geet = geet;
	}

	@Override
	public String toString() {
		return "Greeting [geet= " + geet + "]";
	}
	
}
