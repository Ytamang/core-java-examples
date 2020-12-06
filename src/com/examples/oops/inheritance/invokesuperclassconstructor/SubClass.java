package com.examples.oops.inheritance.invokesuperclassconstructor;

public class SubClass extends SuperClass{
    String name;

    SubClass(String name){
        super(name);
    }

    public static void main(String[] args) {
        SubClass subClass= new SubClass("Yubraj Tamang");
        subClass.getName();
    }
}
