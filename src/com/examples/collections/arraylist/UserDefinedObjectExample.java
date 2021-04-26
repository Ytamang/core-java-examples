package com.examples.collections.arraylist;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UserDefinedObjectExample {
    public static void main(String[] args) {
        UserDefinedExample userDefinedExample= new UserDefinedExample(1, "Rita", 25);
        UserDefinedExample userDefinedExample1= new UserDefinedExample(2, "Yubraj", 26);
        ArrayList<UserDefinedExample> list= new ArrayList<>();
        list.add(userDefinedExample);
        list.add(userDefinedExample1);

        //after iterating list
            Iterator iterator = list.iterator();
            while (iterator.hasNext()){
                UserDefinedExample u = (UserDefinedExample)iterator.next();
                System.out.println(u.roll+ " " + u.name+ " " + u.age);
        }

    }

    static class UserDefinedExample{
        int roll;
        String name;
        int age;

        UserDefinedExample(int roll, String name, int age){
            this.roll=roll;
            this.name=name;
            this.age=age;
        }
    }
}
