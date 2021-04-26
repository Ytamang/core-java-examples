package com.examples.collections.arraylist;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayListExample {
    public static void main(String[] args) {
        //creating list
        List<String> list = new ArrayList<>();
        list.add("Rita");
        list.add("Yubraj");
        list.add("Biku");

        //sorting with sort()
        Collections.sort(list);

        List<Integer> list1= new ArrayList<>();
        list1.add(12);
        list1.add(1);
        list1.add(122);
        list1.add(124);

        Collections.sort(list1);
        System.out.println(list);
        System.out.println(list1);

        //traversing through list
        for(String names:list){
            System.out.println(names);
        }

        for(Integer num:list1){
            System.out.println(num);
        }
    }
}
