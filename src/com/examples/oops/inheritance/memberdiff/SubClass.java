package com.examples.oops.inheritance.memberdiff;

public class SubClass extends SuperClass{
    int a=1;

    public void function(){
        System.out.println("This is a function from SubClass.");
    }

    public void displayDetails(){

        //instantiating SubClass
        SubClass subClass= new SubClass();

        //invoding SubClass function
        subClass.function();

        //invoking SuperClass function
        super.function();

        //invoking SubClass variable
        System.out.println("Variable from SubClass: "+ subClass.a);

        //invoking SuperClass variable
        System.out.println("Vatiable from SuperClass : "+ super.a);
    }

    public static void main(String[] args) {
SubClass subClass = new SubClass();
subClass.displayDetails();

    }
}
