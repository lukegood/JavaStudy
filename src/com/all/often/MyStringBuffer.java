package com.all.often;

public class MyStringBuffer {
    public static void main(String[] args){
        StringBuffer buf = new StringBuffer();
        buf.append("Hello").append(", ").append("StringBuffer");
        change(buf);
        System.out.println(buf);
        String temp = buf.toString();
        System.out.println(temp);
        if(temp.contentEquals(buf)){
            System.out.println("Yes!");
        }
    }

    public static void change(StringBuffer buf){
        buf.append("!");
    }
}
