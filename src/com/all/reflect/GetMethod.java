package com.all.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class GetMethod {
    public static void main(String[] args) throws Exception{
        Class<?> cls = Class.forName("com.all.other.Book");
        Constructor<?> con = cls.getConstructor(String.class, double.class);
        Object obj = con.newInstance("JavaStudy", 1999);
        Method printInfo = cls.getMethod("printInfo");
        printInfo.invoke(obj);
    }
}
