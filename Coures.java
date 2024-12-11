package myPack.famt.StudentApplication;

public class Coures {
	int courseId;
	String courseName;
	int credits;
	String startDate;

	public Coures() {
		super();
	}

	public Coures(int courseId, String courseName, int credits, String startDate) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.credits = credits;
		this.startDate = startDate;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Coures: [Course Id= " + courseId + ", Course Name= " + courseName + ", Credits= " + credits
				+ ", Start Date= " + startDate + "]";
	}

}
