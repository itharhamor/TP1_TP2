package tp2ex3;

abstract class Book {
	protected String title ;
    protected String author ; 
    protected int year_of_publication; 

    public Book (String title ,String author , int year_of_publication ){
        this.author = author ; 
        this.year_of_publication = year_of_publication; 
        this.title = title; 
    }
    public String getTitle(){
    	return this.title;
    }
    public String getAuthor(){
    	return this.author;
    }
    public int getYearOfPublication(){
    	return this.year_of_publication;
    }

    public abstract void displayInformation();
}
