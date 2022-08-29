package com.DataStructure;

class Link_List {
    Node head;
     class Node{
         String data;
         Node next;

         Node(String data){
             this.data = data;
             this.next = null;
         }
     }
    public void addFirst(String data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;

    }

    public void addLast(String data){
         Node newNode = new Node(data);
         if (head == null){
             head = newNode;
             return;
         }
         Node iterate = head;
         while (iterate.next != null){
             iterate = iterate.next;
         }
         iterate.next = newNode;

    }

    public int get_length(){
         int length = 0;
         Node iterate = head;
         while (iterate != null){
             length ++;
             iterate = iterate.next;
         }
         return length;
    }

    public void insert_at(int index, String data){
        if (index < 0 && index > get_length()){
            System.out.println("Index is out of range");
            return;
        }

        Node newNode = new Node(data);
        if (index == 0){
            addFirst(data);
        }

        int count = 0;
        Node iterate = head;
        while (iterate != null){
            if (count == index - 1){
                newNode.next = iterate.next;
                iterate.next = newNode;
                return;
            }
            count++;
            iterate = iterate.next;
        }
    }

    public void remove_at(int index){
        if (index < 0 && index > get_length()){
            System.out.println("Index is out of range");
            return;
        }

        if (index == 0){
            head = head.next;
            return;
        }

        int count = 0;
        Node iterate = head;
        while (iterate != null){
            if (count == index - 1){
                iterate.next = iterate.next.next;
                return;
            }
            count++;
            iterate = iterate.next;
        }
    }

    public void add_list(String[] arr){
         for (int i = 0; i < arr.length; i++){
             addLast(arr[i]);
         }
    }

    public Node reverse_list(){
        Node prev = null;
        Node iterate = head;
        while (iterate != null){
            Node nxt = iterate.next;
            iterate.next = prev;
            prev = iterate;
            iterate = nxt;
        }
        head = prev;
        return head;
     }


    public void printList(){
         if (head == null){
             System.out.println("Linked List is empty");
             return;
         }

         Node iterate = head;
         while (iterate != null ){
             System.out.print(iterate.data + " ---> ");
             iterate = iterate.next;
         }

        System.out.println("NULL");
    }

     public static void main (String[] args){
         Link_List list = new Link_List();
         list.addFirst("is");
         list.printList();
         list.addFirst("a");
         list.printList();
         list.addLast("men");
         list.printList();
         list.insert_at(1, "Ram");
         list.printList();
         list.remove_at(1);
         list.printList();
         System.out.println(list.get_length());
         list.add_list(new String[]{"Hello", "World"});
         list.printList();
         list.reverse_list();
         list.printList();
     }
}
