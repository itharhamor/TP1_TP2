package tp2ex3;

import java.util.ArrayList;

class Teacher implements LibraryUser{
	private ArrayList<Book> borrowedBooks=new ArrayList<>() ; 
    private teacherLibraryCard teacherLibraryCard ; 

    public Teacher(int id , String name , Library library ){
        this.setTeacherLibraryCard(new teacherLibraryCard(id, name, library)); 
    } 
    public teacherLibraryCard getTeacherLibraryCard() {
		return teacherLibraryCard;
	}
	public void setTeacherLibraryCard(teacherLibraryCard teacherLibraryCard) {
		this.teacherLibraryCard = teacherLibraryCard;
	}
	public void borrowBook(String title , String author , Library library){
        for (Book b : library.inventory){
            if (b.getAuthor().equals(author) && b.getTitle().equals(title)){
                borrowedBooks.add(b); 
                library.removeBook(b);
            }
        }
    }

    public void returnBook(Book b,Library library ){
        library.addBook(b);
        borrowedBooks.remove(b); 
    }
    class teacherLibraryCard{
        int id ; 
        String teacherName ; 
        Library library ; 
        public teacherLibraryCard(int id , String teacherName , Library library){
            this.id = id ; 
            this.teacherName = teacherName;
            this.library = library ; 
        }
    }
}