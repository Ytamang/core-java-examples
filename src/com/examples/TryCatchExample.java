package com.examples;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			int a=10;
			
			int array[]=new int[3];
			System.out.println(array);
			
			//inserting data into array 
			array[0]=10;
			System.out.println(array[0]);
			array[1]=20;
			System.out.println(array[1]);
			array[2]=30;
			System.out.println(array[2]);
			array[3]=40;		
			System.out.println(array[3]);
			
			int count=args.length;
			
			if(count==0) throw new ArithmeticException("Denominator is zero. Please check that.");
			
				int result = a/count;
				
				System.out.println("Result is: "+ result);
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index given: " + e.getMessage());
		}
	}
}
