package com.all.test;
import com.all.thread.ThreadByThread;

public class ThreadByThreadTest {
    public static void main(String[] args) {
        ThreadByThread mt1 = new ThreadByThread();
        ThreadByThread mt2 = new ThreadByThread();
        ThreadByThread mt3 = new ThreadByThread();
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
