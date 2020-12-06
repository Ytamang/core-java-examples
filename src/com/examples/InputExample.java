package com.examples;

import java.util.Scanner;

//class level
public class InputExample {
	
	
	//main method
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		
		String name = s.nextLine();
		
		System.out.println("Name is: "+name);
	
	}
	
	
}
