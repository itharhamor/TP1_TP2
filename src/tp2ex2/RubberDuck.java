package tp2ex2;

class RubberDuck extends Duck implements Quackable{
	public void swim() {
        System.out.println("I am a RubberDuck swimming!");
    }

    
    public void display() {
        System.out.println("I am a RubberDuck being displayed!");

    }

    public void quack(){
        System.out.println("I am a RubberDuck Duck quacking!"); 

    }
}
