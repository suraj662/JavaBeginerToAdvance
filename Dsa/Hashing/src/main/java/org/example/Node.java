package org.example;


public class Node {
    Object ele;
    Node next;

    Node(Object ele){
        this.ele = ele;
    }
    public Node(Object ele , Node next){
        this.ele = ele;
        this.next = next ;
    }
}