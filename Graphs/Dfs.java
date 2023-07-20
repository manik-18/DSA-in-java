package Graphs;

import java.util.ArrayList;

public class Dfs {

    static void dfs(int node, boolean visited[], ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> adj) {

        visited[node] = true;
        ls.add(node);

        for (Integer it : adj.get(node)) {
            if (!visited[it]) {
                dfs(it, visited, ls, adj);
            }
        }
    }

    static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, ls, adj);
        return ls;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(2).add(4);
        adj.get(2).add(4);
        adj.get(3).add(0);
        adj.get(4).add(2);

        ArrayList<Integer> ans = dfsOfGraph(V, adj);
        System.out.println(ans);
    }
}
