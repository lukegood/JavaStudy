package com.all.test;
import com.all.thread.ThreadSynchronized;

public class ThreadSynchronizedTest {
    public static void main(String[] args){
        ThreadSynchronized mt = new ThreadSynchronized();
        new Thread(mt, "t1").start();
        new Thread(mt, "t2").start();
    }
}
