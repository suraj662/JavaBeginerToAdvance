package org.example;
import java.util.*;

public class CreateGraph {

    // Edge class
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    // method to create graph
    static void createGraph1(ArrayList<Edge>[] graph) {

        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 3, 7));
        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 4, 1));
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        createGraph1(graph);

        for (int i = 0; i < V; i++) {

            System.out.print("Node " + i + " -> ");

            for (int j = 0; j < graph[i].size(); j++) {

                Edge e = graph[i].get(j);

                System.out.print("(" + e.src + "," + e.dest + "," + e.wt + ") ");
            }

            System.out.println();
        }
    }
}