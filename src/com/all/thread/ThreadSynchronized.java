package com.all.thread;

public class ThreadSynchronized implements Runnable {
    private int ticket = 5;
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("remain:" + ticket--);
                }
            }
        }
    }
}
