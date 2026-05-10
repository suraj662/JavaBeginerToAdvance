package com.example;

public class Queue {
    Node head;
    int count=0;

    //to add ele at first
    public void add(Object ele){
        Node n = new Node(ele);
        if(head == null){
            head = n;
            count++;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        curr.next = n;
        count++;
    }

    public int size(){
        return  count;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public Object peek(){
        return head.ele;
    }

    public Object poll(){
        Object key = head.ele;
        head = head.next;
        return key;
    }

    // Traverses from Front to Rear using 'curr' pointer - O(N)
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node curr = head;
        System.out.print("Queue (Front -> Rear): ");
        while (curr!= null) {
            System.out.print(curr.ele + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main() {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.poll());
        q.display();
        System.out.println(q.peek());
        System.out.println("-------------------------");

    }
}

