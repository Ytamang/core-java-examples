package com.examples;

public class Example {

	public static void main(String[] args) {
		
		try {
    		int a=8;
    		int count=args.length;
    	
    		int result=a/count;
            System.out.println("Result is: "+ result); 
    	
    }
		catch(Exception e) {
			System.out.println("Denominator zero");
		}
	}

}
    


