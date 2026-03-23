package org.example;
import java.util.*;

class Graph {

    int V;
    List<Integer>[] adj;

    // Constructor
    Graph(int V) {
        this.V = V;

        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    // Add edge (undirected)
    void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // Print graph
    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adj[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}

public class uniDirGraph {
    public static void main(String[] args) {

        Graph g = new Graph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.printGraph();
    }

}
