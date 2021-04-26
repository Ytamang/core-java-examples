package com.examples.collections.arraylist;

import java.io.*;
import java.util.ArrayList;

public class SerializationAndDeserializationExample {
    //converting an object into byte stream- serialization
    //creating java object in memory using byte stream - deserialization

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Yubraj");
        list.add("Rita");
        list.add("Biku");

        //serialization
        try {
            FileOutputStream fileOutputStream= new FileOutputStream("/Users/yubtam/Desktop/samplefile.csv");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            fileOutputStream.close();
            objectOutputStream.close();
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialization
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("/Users/yubtam/Desktop/samplefile.csv");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            ArrayList list1= (ArrayList) objectInputStream.readObject();
            System.out.println(list1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
