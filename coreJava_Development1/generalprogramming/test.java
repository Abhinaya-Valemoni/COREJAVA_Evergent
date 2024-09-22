package com.evergent.corejava.generalprogramming;
import java.util.Scanner;
public class test {
	enum Colour{
		Red,Green;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("hiii");
		
		Scanner sc= new Scanner(System.in);
		String a=sc.next();
		
		switch (Colour.valueOf(a)) {
		case Red:
			System.out.println("hello");
			break;
		}
		}

	}

}
