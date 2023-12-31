package tp1ex2;

class MainUniversity {
	public static void main(String[] args) {
		
		//Creating instructor, course and student
        Instructor instructor = new Instructor(101, "Math", "Instructor");
        Course mathCourse = new Course(1, "Mathematics", instructor);
        Student student = new Student(1001, "First","Regsitered Student");
        
        //Displaying student info
        System.out.println("Student ID " + student.getStudentstudentId());
        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Enrolled Courses: " + student.getCourses());
        
        //Enrolling student in course
        student.enroll(mathCourse);
        
        //Displaying updated student info
        System.out.println("-------------------------------------");
        System.out.println("Student ID: " + student.getStudentstudentId());
        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Enrolled Courses: ");
        for (Course i : student.getCourses()) {
        	System.out.println("\n"+i.toString());
        }
	}
}
