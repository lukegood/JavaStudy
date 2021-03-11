package com.all.net;
import java.net.ServerSocket;
import java.util.Scanner;
import java.io.PrintStream;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(8888);
        Socket client = server.accept();
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
        server.close();
    }
}
