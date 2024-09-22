package com.evergent.corejava.abtractclass;
abstract public class Product2 {//The type Product must be an abstract class to define abstract methods
	public Product2() { //constructor
		System.out.println("hello");
	}
	abstract public void NewProduct();
	//public void NewProduct(); This method requires a body instead of a semicolon
	public void allproducts() {
		System.out.println("All Products");
	}
}
