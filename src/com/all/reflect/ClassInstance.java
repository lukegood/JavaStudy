package com.all.reflect;
import java.util.Date;

public class ClassInstance {
    public static void main(String[] args) throws Exception{
        Date date = new Date();
        Class<?> cls = date.getClass();
        System.out.println("method1:" + cls.getName());
        Class<?> cls2 = Date.class;
        System.out.println("method2:" + cls2.getName());
        Class<?> cls3 = Class.forName("java.util.Date");
        System.out.println("method3:" + cls3.getName());
    }
}
