package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    private static void dfs(int src, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {
        vis[src] = 1;
        for (int it : adj.get(src)) {
            if (vis[it] == 0) {
                dfs(it, vis, st, adj);
            }
        }
        st.push(src);
    }

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adj);
            }
        }
        int i = 0;
        while (!st.isEmpty()) {
            vis[i] = st.peek();
            st.pop();
            i++;
        }
        return vis;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);
        int[] topologicalOrder = topoSort(V, adj);
        System.out.println("Vertices in Topological Order:");
        for (int vertex : topologicalOrder) {
            System.out.print(vertex + " ");
        }
    }
}
