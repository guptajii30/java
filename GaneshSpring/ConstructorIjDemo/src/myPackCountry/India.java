package myPackCountry;

public class India {
	int noOfState;
	String capital;
	String area;
	UnionTerritories ut;
	
		public India() {
		super();
	}
		public India(int noOfState, String capital, String area, UnionTerritories ut) {
		super();
		this.noOfState = noOfState;
		this.capital = capital;
		this.area = area;
		this.ut = ut;
	}
		public int getNoOfState() {
			return noOfState;
		}
		public void setNoOfState(int noOfState) {
			this.noOfState = noOfState;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public UnionTerritories getUt() {
			return ut;
		}
		public void setUt(UnionTerritories ut) {
			this.ut = ut;
		}
		@Override
		public String toString() {
			return "[No Of State= " + noOfState + ", Capital= " + capital + ", Area= " + area + "]";
		}

}
