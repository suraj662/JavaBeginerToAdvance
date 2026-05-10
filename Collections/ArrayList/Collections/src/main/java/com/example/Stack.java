package com.example;

import java.util.EmptyStackException;

public class Stack {
    Node head;
    int count =0;

    public void push(Object ele){
        Node n = new Node(ele);
        if(head == null){
            head = n;
            count++;
            return;
        }
        n.next = head;
        head = n;
        count++;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count ==0;
    }

    public Object peek(){
        return head.ele;
    }

    public Object pop(){
        if(head == null){
            throw new EmptyStackException();
        }
        Object key = head.ele;
        head = head.next;
        count--;
        return key;
    }

    // Method to print the stack elements from Top to Bottom
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node curr = head; // Using curr to traverse the list
        System.out.print("Stack (Top -> Bottom): ");
        while (curr!= null) {
            System.out.print(curr.ele + " ");
            curr = curr.next; // Move to the next node
        }
        System.out.println();
    }

    public static void main() {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size()); //5
        s.display();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
    }

}

