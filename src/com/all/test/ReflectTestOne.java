package com.all.test;

import com.all.other.Book;

import java.lang.reflect.Constructor;

public class ReflectTestOne {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.all.other.Book");
        Constructor<?> temp = cls.getConstructor();
        Object obj = temp.newInstance();
        System.out.println((Book)obj);
    }
}
