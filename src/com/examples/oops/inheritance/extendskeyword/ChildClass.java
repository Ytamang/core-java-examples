package com.examples.oops.inheritance.extendskeyword;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class ChildClass extends ParentClass {

    int i;
    static Scanner scanner= new Scanner(System.in);
    public void multiply(int a, int b){
        i=a*b;
        System.out.println("Multiplication of a and b is: "+i);
    }
    //main method
    public static void main(String[] args) {

        System.out.println("Enter value for a: ");
        int a=scanner.nextInt();

        System.out.println("Enter value for b: ");
        int b=scanner.nextInt();

        //option 1
        ChildClass childClass= new ChildClass();
        childClass.multiply(a, b);
        childClass.sum(a, b);
        childClass.diff(a, b);

        //option 2: using superclass reference variable, you can't access the subclass functions/methods
//        ParentClass parentClass= new ChildClass();
//        parentClass.sum(a, b);
//        parentClass.diff(a, b);
        //this can't be done since it belongs to subclass
//        parentClass.multiplicaiton(a,b);
    }

//    1. Subclass inherits all fields and members from superclass but not constructor since it is not a member.
//    2. But the constructor of superclass can be invoked from subclass.
}
