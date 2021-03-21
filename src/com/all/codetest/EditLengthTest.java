package com.all.codetest;

public class EditLengthTest {
    public static void main(String[] args){
        String str1 = "horse", str2 = "ros";
        EditLength test = new EditLength();
        int res = test.minDistance(str1, str2);
        System.out.println(res);
    }
}
