package com.evergent.corejava.final1;
//we cant override final method and inherit
class MyClass
{
	final public void myProducts()
	{
		System.out.println("All products");
	}
}
public class FinalDemo2 extends MyClass{
	final String cname="India";
	//cannot overide the final method from MyClass
	public void myProducts1()
	{
		System.out.println("Hello Products");
	}
	public void myData()
	{
		System.out.println("cname:"+cname);
	}
	public static void main(String[] args) {
		FinalDemo2 fd =new FinalDemo2();
		fd.myData();
		fd.myProducts();
	}
}