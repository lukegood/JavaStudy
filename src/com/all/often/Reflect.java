package com.all.often;
import java.util.Date;

public class Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //方法1：使用getClass()
        Date date = new Date();
        Class<?> cls = date.getClass();
        System.out.println(cls.getName());

        //方法2：使用类.class
        Class<?> cls2 = Date.class;
        System.out.println(cls2.getName());

        //方法3：调动Class类提供的方法
        Class<?> cls3 = Class.forName("java.util.Date");
        System.out.println(cls3.getName());
    }
}
