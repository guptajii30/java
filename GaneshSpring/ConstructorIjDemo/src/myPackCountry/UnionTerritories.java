package myPackCountry;

public class UnionTerritories {
	int noofUT;
	
	public UnionTerritories() {
		super();
	}

	public UnionTerritories(int noofUT) {
		super();
		this.noofUT = noofUT;
	}

	@Override
	public String toString() {
		return "[No of UT= " + noofUT + "]";
	}

	public int getNoofUT() {
		return noofUT;
	}

	public void setNoofUT(int noofUT) {
		this.noofUT = noofUT;
	}
}
