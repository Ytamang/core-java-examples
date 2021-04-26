package com.examples.collections.arraylist;

import java.util.ArrayList;

public class IsEmptyExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Empty list: "+list);
        list.add("Yubraj");
        list.add("Rita");
        list.add("Rup");

        System.out.println("After adding 3 elements: "+ list);
        System.out.println("Is ArrayList Empty: "+ list.isEmpty());
    }
}
