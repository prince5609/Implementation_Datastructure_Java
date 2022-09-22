package com.DataStructure;


public class Queue {
    private final int  front, capacity;
    private static int rear;
    private final int [] queue;

    Queue(int c){
        front = rear = 0;
        capacity = c;
        this.queue = new int[c];
    }

    public void push(int x){
        if (rear == capacity){
            System.out.println("Queue Is Full");
            return;
        }
        queue[rear] = x;
        System.out.println("Element " + x + " added to queue");
        rear++;
    }

    public void pop(){
        if (rear == front){
            System.out.println("Queue Is Empty");
            return;
        }
        int x = queue[front];
        for (int i = 0; i < rear - 1; i++){
            queue[i] = queue[i + 1];
        }
        System.out.println("Element " + x + " removed from queue");
        rear--;
        queue[rear] = 0;
    }

    public void printQueue(){
        for (int i : queue){
            System.out.print(i + " ");
        }
    }

    public static void main(String [] args){
        Queue q = new Queue(10);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.printQueue();
        System.out.println();
        q.pop();
        System.out.println();
        q.printQueue();
        System.out.println();
        q.push(1);
        System.out.println();
        q.printQueue();
        System.out.println();
        q.push(7);
        q.push(8);
        q.push(9);
        q.push(10);
        System.out.println();
        q.printQueue();

    }
}

