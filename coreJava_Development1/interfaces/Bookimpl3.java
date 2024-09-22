package com.evergent.corejava.interfaces;
//multiple interfaces extends other interfaces
public class Bookimpl3 implements Book,NewBook {
	public void booktitle() {
		System.out.println("Java Core");
	}
	public void bookauthor() {
		System.out.println("Oracle Crop");
	}
	public void bookprice() {
		System.out.println("550");		
	}
	public void addnewBook() {
		System.out.println("New book");		
	}
	public void show() {
		System.out.println("hiii");
	}
	public void myData() {
	}
	public static void main(String[] args) {
		Bookimpl3 book1=new Bookimpl3();
		Book bi=new Bookimpl3();//can create reference to interface
		bi.bookauthor();
		bi.bookprice();
		bi.booktitle();
		book1.addnewBook();
	}
}
