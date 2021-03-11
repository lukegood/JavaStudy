package com.all.net;
import java.net.Socket;
import java.net.ServerSocket;

public class EchoServer2 {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(8888);
        boolean flag = true;
        while(flag){
            Socket client = server.accept();
            new Thread(new EchoThread(client)).start();
        }
    }
}
