package myPack.RESTfull.RESTfull.Entity;

public class Student {
	int rollNo;
	String studNm;
	int mrks1, mrks2, mrks3;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String studNm, int mrks1, int mrks2, int mrks3) {
		super();
		this.rollNo = rollNo;
		this.studNm = studNm;
		this.mrks1 = mrks1;
		this.mrks2 = mrks2;
		this.mrks3 = mrks3;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudNm() {
		return studNm;
	}

	public void setStudNm(String studNm) {
		this.studNm = studNm;
	}

	public int getMrks1() {
		return mrks1;
	}

	public void setMrks1(int mrks1) {
		this.mrks1 = mrks1;
	}

	public int getMrks2() {
		return mrks2;
	}

	public void setMrks2(int mrks2) {
		this.mrks2 = mrks2;
	}

	public int getMrks3() {
		return mrks3;
	}

	public void setMrks3(int mrks3) {
		this.mrks3 = mrks3;
	}

	@Override
	public String toString() {
		return "Student [Roll No= " + rollNo + ", Student Name= " + studNm + ", marks 1= " + mrks1 + ", marks 2= " + mrks2 + ", marks 3= "
				+ mrks3 + "]";
	}
	

}
