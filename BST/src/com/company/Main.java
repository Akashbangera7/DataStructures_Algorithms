package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree newTree = new Tree();
        newTree.insert(25);
        newTree.insert(20);
        newTree.insert(15);
        newTree.insert(27);
        newTree.insert(30);
        newTree.insert(29);
        newTree.insert(26);
        newTree.insert(22);
        newTree.insert(32);

        newTree.inorderTraversal();
        System.out.println("");
        newTree.preorderTraversal();
        System.out.println("");
        newTree.postorderTraversal();
        System.out.println("");
        System.out.println(newTree.get(15).getData());
        System.out.println(newTree.get(55));
        System.out.println(newTree.min());
        System.out.println(newTree.max());
    }
}
