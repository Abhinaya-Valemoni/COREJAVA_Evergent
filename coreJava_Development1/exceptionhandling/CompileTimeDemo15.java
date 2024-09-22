package com.evergent.corejava.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CompileTimeDemo15 {

	public static void main(String[] args) {
		try {
			File file=new File("c:/myadata/myinfo.txt");
			Scanner scanner=new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();			
		}
	}
}
