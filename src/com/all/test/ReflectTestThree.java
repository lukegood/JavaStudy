package com.all.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import com.all.other.Book;

public class ReflectTestThree {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("com.all.other.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        Object obj = con.newInstance("JavaStudy", 1000);
        Method printMethod = cls.getMethod("printInfo");
        printMethod.invoke(obj);
    }
}
