package tp2ex3;

class Textbook extends Book {

	public Textbook (String title , String author , int year_of_publication){
        super(title , author , year_of_publication); 
    }
	public void displayInformation() {
		System.out.println("Textbook title: " + this.title);
        System.out.println("Textbook author: " + this.author);
        System.out.println("Textbook was published in: " + this.year_of_publication);
        System.out.println("********************************************************");

	}

}