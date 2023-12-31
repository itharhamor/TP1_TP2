package tp2ex1;

class MainCustomStack {
	public static void main(String[] args) {
        CustomStack stack = new CustomStack(3); //Creating a stack with a maximum capacity of 3

        System.out.println("Is the stack empty? " + stack.stackIsEmpty());
        
        //Adding 2 elements
        stack.addElement(10);
        stack.addElement(20);
        
        System.out.println("\nIs the stack full? " + stack.stackIsFull());
        
        //Adding one more element
        stack.addElement(30);
        
        System.out.println("\nIs the stack full? " + stack.stackIsFull());
        System.out.println("\nLast element in the stack: " + stack.lastInStack());

        stack.removeElement();

        System.out.println("\nLast element in the stack after removal: " + stack.lastInStack());
        
        stack.addElement(40);
        System.out.println("\nLast element in the stack after addition: " + stack.lastInStack());
        
        //Trying to add more elements than the stack capacity
        stack.addElement(50);
        stack.addElement(60); 

        System.out.println("\nIs the stack full? " + stack.stackIsFull());
    }

}
