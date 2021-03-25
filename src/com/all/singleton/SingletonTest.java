package com.all.singleton;

public class SingletonTest {
    private final static SingletonTest inst = new SingletonTest();
    private String info;
    private SingletonTest(){
        this.info = "This is a SingletonTest Object!";
    }

    public void printInfo(){
        System.out.println(info);
    }

    public static SingletonTest getInstance(){
        return inst;
    }
}
