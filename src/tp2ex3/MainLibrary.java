package tp2ex3;

class MainLibrary {
	 public static void main(String[] args) {
		 
	        // Library Creation
	        Library library = new Library();

	        // Adding novels and textbooks to library
	        Book novel1 = new Novel("The Great Novel", "John Doe", 2000);
	        Book novel2 = new Novel("Awesome Story", "Jane Smith", 1995);
	        Book textbook1 = new Textbook("Math Fundamentals", "Prof. Johnson", 2010);

	        library.addBook(novel1);
	        library.addBook(novel2);
	        library.addBook(textbook1);

	        //Display inventory
	        library.listInventory();
	        System.out.println("\n\n");

	        // Student and teacher creation
	        Student student1 = new Student(1, "Alice", library);
	        Teacher teacher1 = new Teacher(101, "Prof. Smith", library);

	        //Student and teacher borrowing a book
	        student1.borrowBook("The Great Novel", "John Doe", library);
	        teacher1.borrowBook("Awesome Story", "Jane Smith", library);

	        // Display updated inventory
	        library.listInventory();
	        System.out.println("\n\n");

	        // Student and teacher return borrowed books
	        student1.returnBook(novel1, library);
	        teacher1.returnBook(novel2, library);

	        // Display updated inventory
	        library.listInventory();
	    }
}
