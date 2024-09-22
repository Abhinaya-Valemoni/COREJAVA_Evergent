package com.evergent.corejava.abtractclass;
////if any class extend abstract class that class should me override all abstract menthods
public class Productimpl2 extends Product {	
	public void NewProduct() {
		System.out.println("New Product");		
	}
	public void show() {
		System.out.println("Show Method");
	}
	public static void main(String[] args) {
		Productimpl2 product1=new Productimpl2();
		//Product pd=new Product(); cannot create a object to abstract class 
		Product pd = new Productimpl2();// can create reference to abstract class
		product1.allproducts();
		pd.NewProduct();
		
		product1.show();
		//pd.show(); cannot access this class methods
	}
}
