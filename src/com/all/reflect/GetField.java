package com.all.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class GetField {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.all.other.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        Object obj = con.newInstance("JavaStudy", 1999.99);
        Field myString = cls.getDeclaredField("title");
        Field myPrice = cls.getDeclaredField("price");
        myString.setAccessible(true);
        myPrice.setAccessible(true);
        myString.set(obj, "JavaStudy2");
        myPrice.set(obj, 888);
        System.out.println(obj);
    }
}
