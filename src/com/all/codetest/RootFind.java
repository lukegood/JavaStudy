package com.all.codetest;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class RootFind {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.right.right = new TreeNode(9);
        int res = findRoot(root, 3, 9);
        System.out.println(res);
    }

    public static int findRoot(TreeNode root, int o1, int o2){
        TreeNode res = dfs(root, o1, o2);
        return res.val;
    }

    public static TreeNode dfs(TreeNode root, int o1, int o2){
        if(root == null || root.val == o1 || root.val == o2){
            return root;
        }
        TreeNode resLeft = dfs(root.left, o1, o2);
        TreeNode resRight = dfs(root.right, o1, o2);
        if(resLeft != null && resRight != null){
            return root;
        }
        else if(resLeft == null){
            return resRight;
        }
        else{
            return resLeft;
        }
    }
}
