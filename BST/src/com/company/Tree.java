package com.company;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if(root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    //fetch a value from tree
    public TreeNode get( int value ) {
        if(root != null){
            return root.get(value);
        }
        return null;
    }

    //fetching minimum value

    public int min() {
        if(root == null) {
            return Integer.MIN_VALUE;
        }
        return root.min();
    }

    //fetching minimum value

    public int max() {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return root.max();
        }
    }
    //inorder traversal
    public void inorderTraversal() {
        if(root != null) {
            root.inorderTraversal();
        }
    }

    //preorder traversal
    public void preorderTraversal() {
        if(root != null){
            root.preorderTraversal();
        }
    }

    public void postorderTraversal() {
        if (root != null) {
            root.postorderTraversal();
        }
    }




}
