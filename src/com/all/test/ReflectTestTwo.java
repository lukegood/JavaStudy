package com.all.test;

import com.all.other.Book;

import java.lang.reflect.Constructor;

public class ReflectTestTwo {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.all.other.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        Book book = (Book)con.newInstance("JavaStudy", 1000);
        System.out.println(book);
    }
}
