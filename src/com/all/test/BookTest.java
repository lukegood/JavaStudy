package com.all.test;
import com.all.other.Book;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class BookTest {
    public static void main(String args[]){
        List<Book> all = new ArrayList<Book>();
        all.add(new Book("a", 100));
        all.add(new Book("b", 1000));
        if(all.contains(new Book("b", 1000))){
            all.add(new Book("c", 10000));
            all.remove(new Book("a", 100));
        }
        Iterator<Book> iter = all.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
