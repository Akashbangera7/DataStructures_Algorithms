package com.company;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data ) {
        this.data = data;
    }

//insert node to tree
    public void insert(int value) {
        //handling the duplicate elements
        if(value == data){
            return;
        }

        if(value < data) {
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else if(value > data) {
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    //fetching a value
    public TreeNode get(int value) {
        if(value == data) {
            return this;
        }
        if(value < data) {
            if(leftChild != null) {
                return leftChild.get(value);
            }
        }
        else if(value > data) {
            if(rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    //fetching minimum value

    public int min() {
        if(leftChild == null) {
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    //fetching the maximum value

    public int max() {
        if(rightChild == null) {
            return data;
        }
        else {
            return rightChild.max();
        }
    }
    //traverse through the tree with inordar traversal // left - print - right
    public void inorderTraversal(){
        if(leftChild != null) {
            leftChild.inorderTraversal();
        }
        System.out.print(data + ", ");

        if(rightChild != null) {
            rightChild.inorderTraversal();
        }
    }

    //traverse through the tree with preorder traversal // print - left - right
    public void preorderTraversal() {
        System.out.print(data + ", ");
        if(leftChild != null) {
            leftChild.preorderTraversal();
        }
        if(rightChild != null) {
            rightChild.preorderTraversal();
        }
    }

    //traverse through the tree with postorder traversal // left - right - print
    public void postorderTraversal() {
        if(leftChild != null) {
            leftChild.postorderTraversal();
        }
        if(rightChild != null) {
            rightChild.postorderTraversal();
        }
        System.out.print(data + ", ");
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
