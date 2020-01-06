package com;

/**
 * @author Song Yinghui
 * @date 2020/1/6
 * @Version 1.0
 */
public class TreeNode {

    public int val ;

    public TreeNode left ;

    public TreeNode right ;

    public TreeNode(){

    }

    public TreeNode(int val){
        this(val,null,null);
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
