package com.all.test;
import com.all.mode.Singleton;

public class SingletonTest {
    public static void main(String[] args){
        Singleton inst = null;
        inst = Singleton.getInstance();
        inst.print();
    }
}
