package com.DataStructure;

public class Binary_Trees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] arr){
            idx++;
            if (arr[idx] == -1){
                return null;
            }
            Node rootNode = new Node(arr[idx]);
            rootNode.left = buildTree(arr);
            rootNode.right = buildTree(arr);
            return rootNode;
        }
    }

    public static void main(String[] args){
        int [] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(arr);
        System.out.println(root.data);
    }
}
