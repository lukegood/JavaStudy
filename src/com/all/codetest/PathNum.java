package com.all.codetest;

public class PathNum {
    private int res;
    public int uniquePaths(int m, int n) {
        //visited = new boolean[m][n];
        res = 0;
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         visited[i][j] = false;
        //     }
        // }
        dfs(0, 0, m, n);
        return res;
    }

    public void dfs(int row, int col, int m, int n){
        if(row == m - 1 && col == n - 1){
            res++;
            return ;
        }
        if(row + 1 < m){
            dfs(row + 1, col, m, n);
        }
        if(col + 1 < n){
            dfs(row, col + 1, m, n);
        }
        return ;
    }
}
