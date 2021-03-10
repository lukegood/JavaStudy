package com.all.test;
import com.all.thread.ThreadByRunnable;

public class ThreadByRunnableTest {
    public static void main(String[] args){
        ThreadByRunnable mt = new ThreadByRunnable();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
