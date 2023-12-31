package tp2ex2;

class MallardDuck extends Duck implements Quackable,Flyable {
	public void swim(){
        System.out.println("I am a MallardDuck swimming!");
    }   
    public void display (){
        System.out.println("I am a MallardDuck being displayed!"); 
    }
    public void quack(){
        System.out.println("I am a MallardDuck quacking!"); 

    }
    public void fly(){
        System.out.println("I am a Mallard Duck flying!"); 

    }
}
