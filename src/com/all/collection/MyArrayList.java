package com.all.collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args){
        List<String> all = new ArrayList<String>();
        System.out.println("length:" + all.size());
        System.out.println("empty:" + all.isEmpty());
        all.add("Hello");
        all.add(",");
        all.add("ArrayList!");
        Iterator<String> iter = all.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
        for(int i = 0; i < all.size(); i++){
            String str2 = all.get(i);
            System.out.println("2:" + str2);
        }
        System.out.println("length:" + all.size());
        System.out.println("empty:" + all.isEmpty());
    }
}
