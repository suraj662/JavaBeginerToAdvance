package org.example;

public class even {
    public static void even(int i){
        if(i > 10) return;
        if(i % 2 == 0){
            System.out.println(i);
        }
        even(i + 1);
    }
    public static void main(String[] args){
        even(1);
    }
}
