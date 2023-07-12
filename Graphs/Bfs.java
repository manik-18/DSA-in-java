package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

    static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for(Integer it: adj.get(node)){
                if(!visited[it]){
                    visited[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(2).add(4);

        ArrayList<Integer> ans=bfsOfGraph(V,adj);
        System.out.println(ans);
    }
}