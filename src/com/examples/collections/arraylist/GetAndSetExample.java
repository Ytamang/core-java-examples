package com.examples.collections.arraylist;

import java.util.ArrayList;

public class GetAndSetExample {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Rita");
        list.add("YUbraj");
        list.add("Rup");

        for (int i=0; i<list.size(); i++) {
            System.out.println("Returning elements: " + list.get(i));//getting all elements
            System.out.println("Returning element to specific position: " + list.get(0));//first element

            list.set(2,"Bindu");
            System.out.println("Returning elements after set: "+ list.get(2 ));

            //Traversing list
            for (String names:list){
                System.out.println(names);
            }

        }
    }
}
