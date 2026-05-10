package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class ArrayList {
    Object[] o = new Object[10];
    int count = 0;

    public void add(Object ele){
        if(count >= o.length){
            increse();
        }
        o[count] = ele;
        count++;
    }

    public void increse(){
        Object[] a = new Object[o.length + 5];
        for(int i=0;i<o.length; i++){
            a[i] = o[i];
        }
        o = a;
    }

    //size
    public int size(){
        return count;
    }
    //check empty arraylist
    public boolean isEmpty(){
        return count == 0;
    }
    //get element by index
    public Object get(int index){
        if(index < o.length || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        return o[index];
    }

    //check element exist or not
    public boolean contains(int key){
        for(int i=0;i<o.length;i++){
            if(o[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    //add ele by Index
    public void addIndex(Object ele,int index){
        if(index < o.length || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        for(int i= size()-1; i<=index; i++){
            o[i +1] = o[i];
        }
        o[index] = ele;
        count++;
    }

    //remove ele
    public void remove(int index){
        if(index < o.length || index >= size()){
            throw new IndexOutOfBoundsException();
        }

        for(int i = index; i<size();i++){
            o[i-1] = o[i];
        }
        o[size() -1] = null;
        count--;
    }

    //set element by index
    public void set(Object ele,int index){
        if(index < o.length || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        o[index] = ele;
    }

    // 5. Display method: O(N)
    public void display() {
        if (isEmpty()) {
            System.out.println("");
            return;
        }
        System.out.print(" + (i == count - 1? " + ", ");
    }





    public static void main() {
        ArrayList list = new ArrayList();

        // Testing Add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.print("Initial List: ");
        list.display(); // [1, 2, 3]

        // Testing Add at Index
        list.addIndex(1, 15);
        System.out.print("After AddIndex(1, 15): ");
        list.display(); // [1, 4, 2, 3]

        // Testing Remove
        list.remove(2);
        System.out.print("After Removing index 2: ");
        list.display(); // [1, 4, 3]

        // Testing Contains and Get
        System.out.println("Contains 15? " + list.contains(15)); // true
        System.out.println("Element at index 2: " + list.get(2)); // 30

        // Testing Size
        System.out.println("Current Size: " + list.size()); // 3
    }
}

