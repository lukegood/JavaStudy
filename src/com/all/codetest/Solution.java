package com.all.codetest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    private Set<String> res;
    private List<Character> mycharList;
    private StringBuffer oneRes;
    private int len;
    public String[] permutation(String s) {
        if(s == null){
            String[] myres = new String[0];
            return myres;
        }
        res = new HashSet<String>();
        mycharList = new ArrayList<Character>();
        char[] charList = s.toCharArray();
        for(char temp : charList){
            mycharList.add(temp);
        }
        len = mycharList.size();
        oneRes = new StringBuffer();
        dfs(0);
        int i = 0;
        for(String temp : res){
            i++;
        }
        String[] result = new String[i];
        i = 0;
        for(String temp : res){
            result[i] = temp;
            i++;
        }
        return result;
    }
    public void dfs(int x){
        if(oneRes.length() == len){
            //System.out.println("yes!");
            res.add(oneRes.toString());
            return;
        }
        for(int i = 0; i < mycharList.size(); i++){
            char c = mycharList.get(i);
            oneRes.append(c);
            mycharList.remove(i);
            //System.out.println("1:"+oneRes);
            dfs(x + 1);
            mycharList.add(i, c);
            oneRes.delete(x, x + 1);
            //System.out.println("2:"+oneRes);
        }
        return;
    }
}