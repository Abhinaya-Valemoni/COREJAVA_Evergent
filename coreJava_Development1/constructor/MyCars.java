package com.evergent.corejava.constructor;
class Car{
	String color;
	int maxSpeed;
	Car(){//constructor initializing
		color="white";
		maxSpeed=120;			
	}
	Car(String color, int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;		
	}
	void display() {
		System.out.println("color:"+color);
		System.out.println("maxSpeed:"+maxSpeed);
	}
}
public class MyCars {
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car("hii",57);
		car1.display();
		car2.display();
	}
}
