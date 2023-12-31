package tp2ex3;

import java.util.ArrayList;

class Library {
	ArrayList <Book> inventory=new ArrayList<>() ; 

    public void addBook(Book book){
        this.inventory.add(book); 
    }

    public void removeBook(Book book){
    	
        this.inventory.remove(book); 
    }

    public void listInventory(){
    	if(inventory.isEmpty()) {
    		System.out.println("Inventory is empty.");
    		return;
    	}
        System.out.println("This is the inventory of this library:");
        for (Book b : this.inventory){
            b.displayInformation(); 
        }
    }
}
