package com.all.test;
import com.all.thread.ThreadByCallable;

import java.util.concurrent.FutureTask;

public class ThreadByCallableTest {
    public static void main(String[] args) throws Exception {
        ThreadByCallable mt = new ThreadByCallable();
        FutureTask<String> task1 = new FutureTask<>(mt);
        new Thread(task1).start();
        new Thread(task1).start();
        System.out.println(task1.get());
    }
}
