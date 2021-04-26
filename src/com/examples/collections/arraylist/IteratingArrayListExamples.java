package com.examples.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> list  = new ArrayList<>();

        list.add("Rita");
        list.add("Yubraj");
        list.add("Rup");

        //iterate using Iterator Interface
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //iterate using For-each loop
        for(String names:list){
            System.out.println(names);
        }
        //iterate using ListIterator interface
        System.out.println("Traversing list through List Iterator: ");
        ListIterator<String> listIterator= list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            String str  = listIterator.previous();
            System.out.println(str);
        }

        //iterate using for loop
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        //iterate using forEach() method (java 8 new feature
        System.out.println("Traversing list through forEach() method: ");
        list.forEach(a->{
            System.out.println(a);
        });

        //iterate using forEachRemaining() method
        System.out.println("Traversing list through forEachRemaining() method: ");
        Iterator<String> itr    = list.iterator();
        itr.forEachRemaining(a->{
            System.out.println(a);
        });

    }
}
