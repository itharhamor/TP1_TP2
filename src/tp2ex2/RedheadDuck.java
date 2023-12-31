package tp2ex2;

class RedheadDuck extends Duck implements Flyable,Quackable{
	public void swim(){
        System.out.println("I am a RedHeadDuck swimming!");
    }   
    public void display (){
        System.out.println("I am a RedheadDuck being displayed!"); 
    }
    public void quack(){
        System.out.println("I am a RedheadDuck quacking!"); 

    }
    public void fly(){
        System.out.println("I am a RedheadDuck flying!"); 

    }
}
