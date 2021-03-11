package com.all.net;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketUse {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(9999);
        System.out.println("Waiting for client...");
        Socket client = server.accept();
        PrintStream out = new PrintStream(client.getOutputStream());
        out.println("Welcome!");
        out.close();
        client.close();
        server.close();
    }
}
