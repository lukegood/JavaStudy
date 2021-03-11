package com.all.net;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoThread implements Runnable{
    private Socket client;
    public EchoThread(Socket client){
        this.client = client;
    }

    @Override
    public void run(){
        try{
            PrintStream out = new PrintStream(client.getOutputStream());
            Scanner in = new Scanner(client.getInputStream());
            boolean flag = true;
            while(flag){
                if(in.hasNext()){
                    String str = in.next().trim();
                    if(str.equalsIgnoreCase("byebye!")){
                        out.println("OK, bye!");
                        flag = false;
                    }
                    else{
                        out.println("Echo:" + str);
                    }
                }
            }
            in.close();
            out.close();
            client.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
