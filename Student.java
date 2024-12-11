package myPack.famt.StudentApplication;

public class Student {
    private String name;
    private int studId;
    private int courseId;
    private Coures course; // Reference to Course object

    // Constructors, Getters, and Setters for student details

    public Student(String name, int studId, int courseId, Coures course) {
        this.studId = studId;
        this.name = name;
        this.courseId = courseId;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
		this.studId = studId;
	}

	public int getCourseId() {
        return courseId;
    }

    public Coures getCourse() {
        return course;
    }

    // Other getters and setters
}
