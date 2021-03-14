package com.all.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort {
    public static void main(String[] args){
        ArrayList<Integer> all = new ArrayList<Integer>();
        all.add(1);
        all.add(-1);
        all.add(99);
        Collections.reverse(all);
        System.out.println(all);
        Collections.sort(all);
        System.out.println(all);
        Collections.sort(all, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }
        });
        System.out.println(all);
    }
}
