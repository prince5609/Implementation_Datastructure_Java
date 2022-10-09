package com.DataStructure;

import java.util.ArrayList;

public class Stack_As_ArrayList {
     static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static void pop() {
            list.remove(0);
        }

        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size()- 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (s.isEmpty() != true){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
