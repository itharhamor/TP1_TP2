package tp1ex2;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int studentstudentId;
	private String firstName;
	private String lastName;
	private List<Course>courses;
	
	public Student(int studentstudentId, String firstName,String lastName) {
		this.studentstudentId=studentstudentId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.courses=new ArrayList<>();
	}
	public int getStudentstudentId() {
        return studentstudentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enroll(Course course) {
        courses.add(course);
    }
}
