package com.example;

class Node {
    Node next;
    Object ele;

    Node(Object ele, Node next) {
        this.ele = ele;
        this.next = next;
    }

    Node(Object ele) {
        this.ele = ele;
        this.next = null;
    }
}

class singleLL {
    private Node head;
    private int count = 0; // Internal counter for O(1) size retrieval

    // 1. Check if empty: O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // 2. Get Size: O(1)
    public int size() {
        return count;
    }

    // 3. Add to Front (addFirst): O(1)
    public void addFirst(Object ele) {
        Node newNode = new Node(ele, head);
        head = newNode;
        count++;
    }

    // 4. Add to End (add): O(N)
    public void add(Object ele) {
        Node newNode = new Node(ele);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next!= null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
        count++;
    }

    // 5. Add at specific index: O(N)
    public void addIndex(int index, Object ele) {
        if (index < 0 || index > count) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0) {
            addFirst(ele);
            return;
        }
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        curr.next = new Node(ele, curr.next);
        count++;
    }

    // 6. Remove First Node: O(1)
    public void removeFirst() {
        if (isEmpty()) return;
        head = head.next;
        count--;
    }

    // 7. Remove by Element Value: O(N)
    public void remove(Object key) {
        if (isEmpty()) return;

        // If head needs to be removed
        if (head.ele.equals(key)) {
            removeFirst();
            return;
        }

        Node curr = head;
        Node prev = null;
        while (curr!= null &&!curr.ele.equals(key)) {
            prev = curr;
            curr = curr.next;
        }

        if (curr!= null) {
            prev.next = curr.next;
            count--;
        }
    }

    // 8. Display List: O(N)
    public void display() {
        Node curr = head;
        while (curr!= null) {
            System.out.print(curr.ele + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

class Main {
    public static void main(String[] args) {
        singleLL list = new singleLL();

        System.out.println("Is list empty? " + list.isEmpty()); // true

        list.add(10);
        list.add(20);
        list.addFirst(5);      // List: 5 -> 10 -> 20
        list.addIndex(2, 15);  // List: 5 -> 10 -> 15 ->20

        System.out.print("Current List: ");
        list.display();
        System.out.println("Total Size: " + list.size()); // 4

        list.remove(15);
        System.out.print("After removing 15: ");
        list.display();

        list.removeFirst();
        System.out.print("After removing first: ");
        list.display();
    }
}
