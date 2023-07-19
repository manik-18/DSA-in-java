package Graphs;

import java.util.*;

class Pair {
    int first;
    int second;
    
    public Pair(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}

public class BfsUndirectedCycleDetection {
    // Function to detect cycle in an undirected graph.
    static boolean check(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        
        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            
            for (int x : adj.get(node)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(new Pair(x, node));
                } else if (x != parent) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (check(i, V, adj, visited)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        // Adding edges to the graph
        adj.get(0).add(1);
        adj.get(1).addAll(Arrays.asList(0, 2, 4));
        adj.get(2).addAll(Arrays.asList(1, 3));
        adj.get(3).addAll(Arrays.asList(2, 4));
        adj.get(4).addAll(Arrays.asList(1, 3));
        
        BfsUndirectedCycleDetection solution = new BfsUndirectedCycleDetection();
        boolean hasCycle = solution.isCycle(V, adj);
        
        if (hasCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}
