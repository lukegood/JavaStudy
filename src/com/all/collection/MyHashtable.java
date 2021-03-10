package com.all.collection;
import java.util.Hashtable;
import java.util.Map;
import com.all.other.Book;

public class MyHashtable {
    public static void main(String[] args){
        Map<String, Book> all = new Hashtable<String, Book>();
        all.put("one", new Book("a", 100));
        all.put("two", new Book("b", 1000));
        Book temp = all.get("one");
        System.out.println(temp);
    }
}
