package com.all.file;
import com.all.other.Book;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/obj1.txt"));
        oos.writeObject(new Book("Java15.0", 99.9));
        oos.close();
    }
}
