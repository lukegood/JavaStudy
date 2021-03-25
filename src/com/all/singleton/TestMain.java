package com.all.singleton;

public class TestMain {
    public static  void main(String[] args){
        SingletonTest test = SingletonTest.getInstance();
        test.printInfo();
    }
}
