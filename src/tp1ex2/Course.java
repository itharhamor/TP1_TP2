package tp1ex2;

class Course {
	private int courseId;
    private String courseName;
    private Instructor instructor;

    public Course(int coursestudentId, String courseName, Instructor instructor) {
        this.courseId = coursestudentId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getCoursestudentId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public String toString() {
    	return "Course ID ->"+courseId+"\t||\tCourse Name ->"+courseName+"\t||\tCourse Instructor ->"+instructor.getFirstName()+" "+instructor.getLastName();
    }
}
