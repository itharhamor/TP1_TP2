package tp2ex1;

class CustomStack {
	private Object[] stack;
    int index;
    int capacity ;
    public CustomStack(int n){
        index=-1;
        capacity=n;
        stack=new Object[n];
    }

    public void addElement(Object x){
        if (index < capacity  - 1) {
            index++;
            stack[index] = x;
        } else {
            System.out.println("Can't add element: Not enough space. ");
        }

    }

    public void removeElement(){
        if(index>=0)
            index--;
        else{
            System.out.println("Can't remove element: Stack is empty.");
        }


    }
    Object  lastInStack(){
        if (index>=0)
            return stack[index];
        return null;
    }

    boolean stackIsEmpty(){
        return index<0;
    }

    boolean stackIsFull(){
        return index+1==capacity;
    }
}
