package com.evergent.corejava.final1;
//we cant override final method and inheit
final class Hello
{
	final public void myProducts()
	{
		System.out.println("All products");
	}
}
public class FinalDemo3{
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
		FinalDemo3 fd =new FinalDemo3();
		Hello mc=new Hello();
		fd.myData();
		mc.myProducts();//6
	}
}