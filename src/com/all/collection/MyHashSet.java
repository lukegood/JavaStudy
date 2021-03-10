package com.all.collection;
import java.util.HashSet;
import java.util.Set;
import com.all.other.Book;

public class MyHashSet {
    public static void main(String[] args){
        Set<Book> all = new HashSet<Book>();
        all.add(new Book("a", 100));
        all.add(new Book("b", 1000));
        for (Book book : all) {
            System.out.println(book);
        }
    }
}
