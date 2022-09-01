package com.DataStructure;

public class Stack_As_LinkList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class stack {
        public static Node head;

        public static boolean is_empty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (is_empty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if (is_empty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if (is_empty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String []args){
        stack s = new stack();
        s.push(5);
        s.push(10);
        s.push(7);

        while (!s.is_empty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
    }
}

