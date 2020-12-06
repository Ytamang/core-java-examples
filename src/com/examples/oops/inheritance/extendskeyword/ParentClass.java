package com.examples.oops.inheritance.extendskeyword;

public class ParentClass {
    int i;
    public void sum(int a, int b){
        i=a+b;
        System.out.println("The sume of a and b is: "+i);
    }

    public void diff(int a, int b){
        i=a-b;
        System.out.println("The diff of a to b is: "+i);
    }
}
