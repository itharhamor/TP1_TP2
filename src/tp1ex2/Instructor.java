package tp1ex2;

class Instructor {
	private int instructorstudentId;
    private String firstName;
    private String lastName;

    public Instructor(int instructorstudentId, String firstName, String lastName) {
        this.instructorstudentId = instructorstudentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getInstructorstudentId() {
        return instructorstudentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
