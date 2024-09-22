package com.evergent.corejava.oops;
class myPerson{
	public void personInfo() {
		String name = "Ram";
		System.out.println(name);
	}
}
class personDetails extends myPerson{
	public void personData () {
		System.out.println("With age 22");
	}
}
public class multiLevelInheritance extends personDetails  {
	public void show() {
		System.out.println("hello");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiLevelInheritance mi =new multiLevelInheritance();
		mi.personInfo();
		mi.personData();
		mi.show();
		

	}

}
