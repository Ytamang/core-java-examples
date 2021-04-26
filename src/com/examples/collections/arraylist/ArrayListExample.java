package com.examples.collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //generic arraylist
        ArrayList<String> list = new ArrayList<String>();//creating arraylist
        list.add("Yubraj");
        list.add("Rita");
        list.add("Niraj");
        System.out.println("Generic ArrayList: "+ list);

        ArrayList list1= new ArrayList();
        list1.add("Rita");
        list1.add(23);

        System.out.println("Non generic ArrayList: "+ list1);
    }
}
