package com.all.collection;
import com.all.other.Book;
import java.util.Map;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args){
        Map<String, Book> all = new HashMap<String, Book>();
        all.put(null, new Book("a", 1000));
        all.put("one", null);
        Book temp = all.get("one");
        System.out.println(temp);
    }
}
