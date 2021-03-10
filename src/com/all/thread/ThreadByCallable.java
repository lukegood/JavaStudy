package com.all.thread;

import java.util.concurrent.Callable;

public class ThreadByCallable implements Callable<String> {
    private int ticket = 10;
    @Override
    public String call() throws Exception{
        for(int i = 0; i < 50; i++){
            if(ticket > 0) {
                ticket--;
                System.out.println("remain:" + ticket);
            }
            else {
                System.out.println("All ticket was sold!");
            }
        }
        return "Ticket is 0!";
    }
}
