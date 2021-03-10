package com.all.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class ReflectTestFour {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.all.other.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        Object obj = con.newInstance("JavaStudy", 65.9);
        Field titleField = cls.getDeclaredField("title");
        titleField.setAccessible(true);
        titleField.set(obj, "JavaStudy2");
        System.out.println(titleField.get(obj));
    }
}
