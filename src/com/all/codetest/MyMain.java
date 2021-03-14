package com.all.codetest;
import com.all.codetest.Solution;

public class MyMain {
    public static void main(String[] args){
        Solution s = new Solution();
        String[] res = s.permutation("ab");
        for(String temp : res){
            System.out.println(temp);
        }
    }
}
