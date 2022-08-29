package com.DataStructure;

class Doubly_Linked_List {
    Node head;
    class Node{
        String data;
        Node next;
        Node prev;

        Node(String data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void add_first(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
    }

    public void add_last(String data){
        Node newNode = new Node(data);
        if (head == null){
            add_first(data);
            return;
        }
        Node iterate = head;
        while (iterate.next != null){
            iterate = iterate.next;
        }
        iterate.next = newNode;
        newNode.prev = iterate;
    }

    public int get_length(){
        if(head == null) {
            return 0;
        }
        int count = 1;
        Node iterate = head;
        while (iterate.next != null){
            count++;
            iterate = iterate.next;
        }
        return count;
    }

    public void insert_at(int index, String data){
        if (index < 0 && index > get_length()){
            System.out.println("Index out of range");
            return;
        }

        if (index == 0){
            add_first(data);
            return;
        }

        if (index == get_length()){
            add_last(data);
            return;
        }

        int count = 1;
        Node iterate = head.next;
        while (iterate != null){
            if (count == index){
                Node newNode = new Node(data);
                newNode.next = iterate;
                newNode.prev = iterate.prev;
                iterate.prev.next = newNode;
                iterate.prev = newNode;
                return;
            }
            count++;
            iterate = iterate.next;
        }
    }

    public void remove_at(int index){
        if (index < 0 && index > get_length()){
            System.out.println("Index out of range");
            return;
        }

        if (index == 0){
            head = head.next;
            head.prev = null;
            return;
        }

        int count = 1;
        Node iterate = head.next;
        while (iterate != null){
            if (count == index){
                iterate.prev.next = iterate.next;
                iterate.next.prev = iterate.prev;
                return;
            }
            count++;
            iterate = iterate.next;
        }
    }

    public void print_list(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        Node iterate = head;
        while (iterate != null){
            System.out.print(iterate.data + " ---> ");
            iterate = iterate.next;
        }
        System.out.println("Null");
    }

    public static void main(String [] args){
        Doubly_Linked_List list = new Doubly_Linked_List();
        list.add_first("Ram");
        list.print_list();
        list.add_last("a");
        list.print_list();
        list.insert_at(1, "is");
        list.print_list();
        list.insert_at(3, "good boy");
        list.print_list();
        System.out.println(list.get_length());
        list.remove_at(2);
        list.print_list();
        System.out.println(list.get_length());
    }
}
