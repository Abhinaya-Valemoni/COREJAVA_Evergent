//encapsulation
package com.evergent.corejava.oops;
public class CalculationDemo {
	int a=2,b=4,c;
	public void addition(){
		c=a+b;
		System.out.println("a+b"+c);
	}
	public void sub(){
		c=a-b;
		System.out.println("a-b"+c);		
	}
	public void mul(){
		c=a*b;
		System.out.println("a*b"+c);		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculationDemo cal = new CalculationDemo();
		cal.addition();
		cal.sub();
		cal.mul();
	}
}
