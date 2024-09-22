package com.evergent.corejava.interfaces;
//multiple interfaces extends other interfaces
public class Bookimpl4 implements Book,NewBook {
	

	

	
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
	public void myData() {
		System.out.println("MyData");
		
	}
	public void show() {
		System.out.println("hiii");
	}
	public static void main(String[] args) {
		//we cannot create object to interface
		//Book bi=new Book();
		Bookimpl4 book1=new Bookimpl4();
		Book bi=new Bookimpl4();//can create reference to interface
		bi.bookauthor();
		bi.bookprice();
		bi.booktitle();
		book1.addnewBook();
		book1.myData();
		//interface reference cannot visible for subclass
		//bi.show();

	}


	
	


	
	

}
