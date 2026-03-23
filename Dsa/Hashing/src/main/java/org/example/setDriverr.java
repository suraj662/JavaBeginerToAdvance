package org.example;

public class setDriverr {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
        s.display();
    }
}
