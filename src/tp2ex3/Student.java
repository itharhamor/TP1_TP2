package tp2ex3;

import java.util.ArrayList;

class Student implements LibraryUser{
	private ArrayList<Book> borrowedBooks=new ArrayList<>(); 
    private studentLibraryCard studentLibraryCard ; 

    public Student(int id , String name , Library library ){
        this.setStudentLibraryCard(new studentLibraryCard(id, name, library)); 
    }   


    public studentLibraryCard getStudentLibraryCard() {
		return studentLibraryCard;
	}


	public void setStudentLibraryCard(studentLibraryCard studentLibraryCard) {
		this.studentLibraryCard = studentLibraryCard;
	}


	public void borrowBook(String title , String author , Library library){
        for (Book b : library.inventory){
            if (b.getAuthor().equals(author) && b.getTitle().equals(title)){
                borrowedBooks.add(b); 
                library.removeBook(b);
                break;
            }
        }
    }

    public void returnBook(Book b,Library library ){
        library.addBook(b);
        borrowedBooks.remove(b);
    }

    class studentLibraryCard{
        int studentId ; 
        String studentName ; 
        Library library ; 
        public studentLibraryCard(int id , String studentName , Library library){
            this.studentId= id ; 
            this.studentName = studentName;
            this.library = library ; 
        }
    }
}
