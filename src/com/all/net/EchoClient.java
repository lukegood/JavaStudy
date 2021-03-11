package com.all.net;
import java.net.Socket;
import java.io.PrintStream;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(client.getOutputStream());
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(client.getInputStream());
        sc.useDelimiter("\n");
        in.useDelimiter("\n");
        boolean flag = true;
        while(flag){
            System.out.println("Input what you want to send:");
            if(sc.hasNext()){
                String str = sc.next().trim();
                out.println(str);
                if(str.equalsIgnoreCase("byebye!")){
                    flag = false;
                }
                if(in.hasNext()){
                    System.out.println(in.next());
                }
            }
        }
        in.close();
        sc.close();
        out.close();
        client.close();
    }
}
