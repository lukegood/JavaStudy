package com.all.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCollections {
    public static void main(String[] args){
        List<Integer> all = new ArrayList<Integer>();
        all.add(999);
        all.add(77);
        all.add(-23);
        all.add(5);
        all.add(99);
        //排序操作
        Collections.reverse(all);
        System.out.println(all);
        Collections.sort(all);
        System.out.println(all);
        Collections.sort(all, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);
            }
        });
        System.out.println(all);
        Collections.swap(all, 0, 1);
        System.out.println(all);
        Collections.rotate(all, -2);
        System.out.println(all);
        Collections.rotate(all, 2);
        System.out.println(all);
        //查找操作
        Collections.sort(all);
        System.out.println(Collections.binarySearch(all, 999));
        System.out.println((Collections.max(all)));
        System.out.println(Collections.min(all));
        Collections.fill(all, 68);
        System.out.println(all);
        System.out.println(Collections.frequency(all, 68));
        System.out.println(Collections.indexOfSubList(all, new ArrayList<Integer>(all)));
        System.out.println(Collections.replaceAll(all, 68, 86));
    }
}
