package com.evergent.corejava.generalprogramming;

public class BigOfFive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30,b=500,c=20,d=4,e=70;
		if(a>b && a>c && a>d &&a>e) {
			System.out.println("a is greatest");
		}
		else if(b>a && b>c && b>d && b>e)
			System.out.println("b is greatest");
		else if (c>a && c>b && c>d && c>e )
			System.out.println("c is greatest");
		else if(d>a && d>c && d>b && d>e)
			System.out.println("d is greatest");
		else
			System.out.println("e is greatest");
		

	}

}
