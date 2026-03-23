package org.example;

public class StackImplement {
    ArrayStack a = new ArrayStack();
    public void push(Object ele) {

        ArrayStack a=new ArrayStack();
        a.add(ele);
        return;

    }

    public static int pop() {

        ArrayStack a=new ArrayStack();
        return a.remove(1);
    }

    public int size() {

        ArrayStack a=new ArrayStack();
        return a.size();
    }



    public boolean isEmpty() {

        ArrayStack a=new ArrayStack();
        return a.isEmpty();

    }
}
