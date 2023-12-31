package tp2ex3;

class Novel extends Book {
	
	public Novel (String title , String author , int year_of_publication){
        super(title , author , year_of_publication); 
    }

	public void displayInformation() {
		System.out.println("Novel title: " + this.title);
        System.out.println("Novel author: " + this.author);
        System.out.println("Novel was published in: " + this.year_of_publication);
        System.out.println("********************************************************");

	}

}
