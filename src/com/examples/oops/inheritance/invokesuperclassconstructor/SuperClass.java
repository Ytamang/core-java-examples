package com.examples.oops.inheritance.invokesuperclassconstructor;

public class SuperClass {
    String name;

    SuperClass(String name){
        this.name=name;
    }

    public void getName(){
        System.out.println("The name in the SuperClass is: "+name);
    }

}
