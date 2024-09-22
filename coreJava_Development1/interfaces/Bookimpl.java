package com.evergent.corejava.interfaces;
//If nay class implements interface that class should ne override all interface methods
public class Bookimpl implements Book {	
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
		Bookimpl bi=new Bookimpl();
		bi.bookauthor();
		bi.bookprice();
		bi.booktitle();
		bi.show();
	}
}
