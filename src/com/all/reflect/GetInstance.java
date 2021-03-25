package com.all.reflect;
import com.all.other.Book;

import java.lang.reflect.Constructor;

public class GetInstance {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.all.other.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        Object obj = con.newInstance("JavaStudy", 1999);
        System.out.println(obj);
    }
}
