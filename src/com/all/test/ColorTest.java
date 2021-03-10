package com.all.test;
import com.all.mode.Color;

public class ColorTest {
    public static void main(String[] args){
        Color inst = Color.getInstance(1);
        System.out.println(inst.getString());
    }
}
