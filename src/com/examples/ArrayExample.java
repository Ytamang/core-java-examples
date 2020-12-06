package com.examples;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		try {
			double a=10;
			int array[]=new int[3];
			array[0]=10;
			array[1]=20;
			array[2]=30;
//			array[3]=40;
			
			for(int i=0; i<3; i++) {
				
				System.out.println("values are: "+array[i]);
			}
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter count: ");
			
			int count =s.nextInt();
			
			if(count==0) throw new ArithmeticException("Denominator is zero. Please check that.");
				double result = a/count;
				System.out.println("Result is: "+ result);
			
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index given: " + e.getMessage());
		}
	}
}
