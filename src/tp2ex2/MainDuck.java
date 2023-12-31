package tp2ex2;	

class MainDuck {
	public static void main(String[] args) {
		Flyable flyingDucks [] = new Flyable[2] ; 
        flyingDucks[0] = new MallardDuck(); 
        flyingDucks[1] = new RedheadDuck(); 
        for (int i = 0 ; i < flyingDucks.length ; i ++){
            flyingDucks[i].fly(); 
            
        }
        
        Quackable quackingDucks []= new Quackable[3]; 
        quackingDucks[0] = new MallardDuck(); 
        quackingDucks[1] = new RubberDuck(); 
        quackingDucks[2] = new RedheadDuck(); 
        for (int i = 0 ; i < quackingDucks.length ; i ++ ){
            quackingDucks[i].quack();
        }

	}
}
