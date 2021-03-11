package com.all.net;
import java.net.Socket;
import java.util.Scanner;

public class SocketUse {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket("localhost", 9999);
        Scanner scan = new Scanner(client.getInputStream());
        scan.useDelimiter("\n");
        if(scan.hasNext()){
            System.out.println(scan.next());
        }
        scan.close();
        client.close();
    }
}
