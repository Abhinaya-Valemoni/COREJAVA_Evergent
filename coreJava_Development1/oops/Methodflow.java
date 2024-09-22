package com.evergent.corejava.oops;
public class Methodflow {
	
	public void show() {//no parameters with no return type
		System.out.println("hii");
	}	
	public void myData(int a, int b) {// parameters with no return type
		System.out.println(a+b);
	}
	public int mul(int a, int b) {	//with parameters with  return type
		return a*b;
	}
	public int change() {//no parameters with return type
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodflow mf=new Methodflow();
		mf.show();
		mf.myData(3, 5);
		System.out.println(mf.mul(3, 3));
		System.out.println(mf.change());
	}
}
