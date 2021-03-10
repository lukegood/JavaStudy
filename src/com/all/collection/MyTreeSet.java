package com.all.collection;
import com.all.other.Book;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args){
        Set<Book> myset = new TreeSet<Book>();
        myset.add(new Book("a", 100));
        myset.add(new Book("b", 1000));
        System.out.println(myset);
    }
}
