package com.DataStructure;

public class Binary_Search_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (root.data > val){
            if (root.left != null){
                root.left = insert(root.left, val);
            }
            else{
                root.left = new Node(val);
            }
        }
        else{
            if (root.right != null){
                root.right = insert(root.right, val);
            }
            else{
                root.right = new Node(val);
            }
        }
        return root;
    }

    public static boolean search(Node root, int val) {
        if (root.data == val) {
            return true;
        }
        if (root.data > val) {
            if (root.left != null) {
                return search(root.left, val);
            }
            else{
                return false;
            }
        }
        if (root.right != null){
            return search(root.right, val);
        }
        else{
            return false;
        }
    }

    public static int find_max(Node root){
        if (root.right == null){
            return root.data;
        }
        return find_max(root.right);
    }

    public static int find_min(Node root){
        if (root.left == null){
            return root.data;
        }
        return find_min(root.left);
    }

    public static boolean is_leaf(Node root){
        return root.left == null && root.right == null;
    }

    public static Node delete(Node root,int val){
        if (root.data > val){
            root.left = delete(root.left, val);
        }
        else if (root.data < val){
            root.right = delete(root.right, val);
        }
        else {     // (root.data == val)
            // Case 1 ----> if it is a leaf node
            if (is_leaf(root)){
                return null;
            }

            // Case 2 -----> Only one Child
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

//            Case 3 ------>  Both Child
            Node IS = in_order_successor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node in_order_successor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public static void in_order_traversal(Node root){
        if (root == null){
            return;
        }
        in_order_traversal(root.left);
        System.out.print(root.data+ " ");
        in_order_traversal(root.right);
    }

    public static void pre_order_traversal(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data + " ");
        pre_order_traversal(root.left);
        pre_order_traversal(root.right);
    }

    public static void post_order_traversal(Node root){
        if (root == null){
            return;
        }
        post_order_traversal(root.left);
        post_order_traversal(root.right);
        System.out.print(root.data + " ");
    }

    public static Node make_tree(int []arr){
        Node root = null;
        for (int i = 0; i < arr.length; i++){
            root = insert(root, arr[i]);
        }
        return root;
    }


    public static void main(String[]args){
        int [] values = {8,5,3,1,4,6,10,11,14};
        Node root = make_tree(values);

        in_order_traversal(root);
        System.out.println();
        pre_order_traversal(root);
        System.out.println();
        post_order_traversal(root);
        System.out.println();
        System.out.println(search(root, 4));
        System.out.println(search(root, 10));
        System.out.println(search(root, 7));
        System.out.println(search(root, 12));
        System.out.println(find_max(root));
        System.out.println(find_min(root));
        delete(root, 4);
        in_order_traversal(root);
        System.out.println();
        insert(root, 4);
        in_order_traversal(root);
        System.out.println();
    }
}