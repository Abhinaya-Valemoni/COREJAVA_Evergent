package com.evergent.corejava.logicalprogramming;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		System.out.print(a+" "+b);
		for(int i=0;i<=10;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

	}

}
