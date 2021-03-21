package com.all.codetest;

public class EditLength {
    private int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 0; i < word1.length() + 1; i++){
            dp[i][0] = i;
        }
        for(int j = 0; j < word2.length() + 1; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i < word1.length() + 1; i++){
            for(int j = 1; j < word2.length() + 1; j++){
                dp[i][j] = myMin(dp[i][j - 1], myMin(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                if(word1.substring(0, i - 1).equals(word2.substring(0, j - 1))){
                    dp[i][j] = myMin(dp[i - 1][j - 1], dp[i][j]);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }

    public int myMin(int num1, int num2){
        if(num1 <= num2){
            return num1;
        }
        else{
            return num2;
        }
    }
}
