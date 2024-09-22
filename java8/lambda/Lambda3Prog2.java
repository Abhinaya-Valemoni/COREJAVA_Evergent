package com.evergent.java8.lambda;

 interface Person3a
 {
	abstract public void eat();
 }

public class Lambda3Prog2 {

	public static void main(String[] args) {
		 
		Person3a p3= () -> { 
			
				System.out.println("Drink ...");
			  			
		};
        p3.eat();
	}

}
