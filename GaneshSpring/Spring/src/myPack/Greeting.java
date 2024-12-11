package myPack;

public class Greeting {
private String str;
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str=str;
	}
	@Override
	public String toString() {
		return "Gretting [str= " + str + "]";
	}

}
