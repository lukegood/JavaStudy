package com.all.file;

import com.all.other.Book;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/obj1.txt"));
        Object obj = ois.readObject();
        Book book = (Book)obj;
        System.out.println(book);
        ois.close();
    }
}
