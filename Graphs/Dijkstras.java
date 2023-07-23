package Graphs;

import java.util.*;

class Pair {
    int distance, node;

    public Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

public class Dijkstras {
    // Function to find the shortest distance of all the vertices
    // from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        // Write your code here
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        pq.add(new Pair(0, S));
        while (pq.size() != 0) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            for (int i = 0; i < adj.get(node).size(); i++) {
                int edgeWt = adj.get(node).get(i).get(1);
                int adNode = adj.get(node).get(i).get(0);
                if (dis + edgeWt < dist[adNode]) {
                    dist[adNode] = dis + edgeWt;
                    pq.add(new Pair(dist[adNode], adNode));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        // Sample input graph (adjacency list representation)
        int V = 5; // Number of vertices
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding edges to the graph
        // Format: (destination vertex, weight)
        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 9)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(2, 6)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(3, 5)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(4, 3)));

        adj.get(2).add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(3, 4)));

        // Source vertex
        int sourceVertex = 0;

        // Find shortest distances from the source vertex
        int[] shortestDistances = dijkstra(V, adj, sourceVertex);

        // Output the results
        System.out.println("Shortest distances from vertex " + sourceVertex + " to all other vertices:");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + shortestDistances[i]);
        }
    }
}
