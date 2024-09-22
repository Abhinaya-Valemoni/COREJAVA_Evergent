package com.evergent.corejava.arrays;

public class DArrayDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][5];
		int k=1;
		for(int i=0;i<5;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				arr[i][j]=k;
				
				System.out.print(" "+arr[i][j]);
				k++;
				
				
			}
		}

	}

}
