package com.evergent.corejava.interfaces;
//If nay class implements interface that class should ne override all interface methods
public class Bookimpl2 implements Book {	
	public void booktitle() {
		System.out.println("Java Core");
	}
	public void bookauthor() {
		System.out.println("Oracle Crop");
	}
	public void bookprice() {
		System.out.println("550");
	}
	public void show() {
		System.out.println("hiii");
	}
	public static void main(String[] args) {
		//we cannot create object to interface
		//Book bi=new Book();
		Book bi=new Bookimpl2();//can create reference to interface
		bi.bookauthor();
		bi.bookprice();
		bi.booktitle();
		//interface reference cannot visible for subclass
		//bi.show();
	}
}
