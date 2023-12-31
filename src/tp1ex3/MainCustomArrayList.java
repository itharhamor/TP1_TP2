package tp1ex3;

class MainCustomArrayList {
	 public static void main(String[] args) {
	        CustomArrayList myList = new CustomArrayList();
	        
	        //Adding 3 elements
	        myList.add("Element 1");
	        myList.add("Element 2");
	        myList.add("Element 3");
	        
	        
	        System.out.println("List Size : " + myList.size());

	        System.out.println("\nIs it empty? : " + myList.isEmpty());

	        System.out.println("\nDoes list contain 'Element 2'? : " + myList.isIn("Element 2"));

	        System.out.println("\nIndex of 'Element 3': " + myList.find("Element 3"));
	        
	        //Printing all elements in list
	        System.out.println("\nElements in list :");
	        for (int i = 0; i < myList.size(); i++) {
	            System.out.println(myList.get(i));
	        }
	        
	        //Removing element
	        myList.remove("Element 2");

	        System.out.println("\nList after removing 'Element 2' :");
	        for (int i = 0; i < myList.size(); i++) {
	            System.out.println(myList.get(i));
	        }
	        
	        //Adding element back in second position
	        myList.add(1,"Element 2");
	        System.out.println("\nList after adding 'Element 2' at the second position :");
	        for (int i = 0; i < myList.size(); i++) {
	            System.out.println(myList.get(i));
	        }
	    }
}
