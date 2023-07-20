package Graphs;

import java.util.ArrayList;

public class DfsDirectedCycleDetection {
    private static boolean dfs(int src, int vis[], int path[], ArrayList<ArrayList<Integer>> adj) {
        vis[src] = 1;
        path[src] = 1;
        for (int it : adj.get(src)) {
            if (vis[it] == 0) {
                if (dfs(it, vis, path, adj)) {
                    return true;
                }
            } else if (path[it] == 1) {
                return true;
            }
        }
        path[src] = 0;
        return false;
    }

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[V];
        int path[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (dfs(i, vis, path, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = 4; // Number of vertices

        // Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Add edges to the graph
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(0);

        DfsDirectedCycleDetection graph = new DfsDirectedCycleDetection();
        boolean isCyclic = graph.isCyclic(V, adj);
        System.out.println("Is the graph cyclic? " + isCyclic);
    }
}
