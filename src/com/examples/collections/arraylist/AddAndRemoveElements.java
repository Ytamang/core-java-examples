package com.examples.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAndRemoveElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rita");
        list.add("Yubraj");
        list.add("Rup");
        list.add("Sarup");
        list.add("Sarita");

        System.out.println("Original list of elements: \n"+ list);

        //adding elements
        list.add("Bindu");
        System.out.println("After adding Bindu Element: \n"+ list);


        //removing element
        list.remove("Yubraj");
        System.out.println("After removing Yubraj from list: \n"+ list);

        //creating new list and adding all
        ArrayList<String> list1= new ArrayList<>();
        list1.add("Nita");
        list1.add("Manita");
        list1.add("Rita");

        //adding list1 to list
        list.addAll(list1);
        System.out.println("After adding all from list1 to list: \n"+ list);

        //retaingAll() method
        list.retainAll(list1);
        System.out.println("Iterating elements after retaing all from list1");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //removing matching words
        list.removeIf(str -> (str.contains("Rup") || str.contains("rup") || str.contains("Rita") || str.contains("rita")));
        System.out.println("Removing matching word Rup/rup and rita/Rita from list: \n"+ list);

        //removing all from list1
        list.removeAll(list1);
        System.out.println("After removing all from list1 : "+list);



        //after removing all from list
        list.removeAll(list);
        System.out.println("After removing all: "+ list);

        //remove all using clear() method
        list.clear();
        System.out.println("After invoking method clear() : \n"+ list);
    }
}
