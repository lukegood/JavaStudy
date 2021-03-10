package com.all.file;
import java.util.Scanner;

public class ScannerTestOne {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            System.out.println(sc.nextDouble());
        }
        sc.close();
    }
}
