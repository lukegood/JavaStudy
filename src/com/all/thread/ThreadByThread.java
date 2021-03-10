package com.all.thread;

public class ThreadByThread extends Thread{
    private int ticket = 10;
    @Override
    public void run(){
        int i = 0;
        for(; i < 20; i++){
            if(ticket > 0){
                System.out.println("sell" + ticket--);
            }
        }
    }
}
