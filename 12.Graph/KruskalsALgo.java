// package Algorithms;
import java.util.*;


public class KruskalsALgo {
    public static int parent(int[] parents , int source){
        if(source == parents[source]){
            return parents[source];
        }
        return parent(parents, parents[source]);
    }
    public static Edge[] kruskalsALgo(Edge[] edges, int v){
        Arrays.sort(edges);
        Edge[] mst = new Edge[v-1];
        int count =0;
        int k = 0;
        int [] parents = new int[v];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
        while(count!=v-1){
            int source_parent = parent(parents  ,edges[k].source);
            int dest_parent = parent(parents , edges[k].destination);
            if(source_parent!=dest_parent){
                mst[count] = edges[k];
                count++;
                parents[source_parent] = dest_parent;

            }
            k++;
        }
        return mst;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        Edge[] edges = new Edge[e];
        for (int i = 0; i < e; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();
            Edge edge = new Edge(source, destination, weight);
            edges[i] = edge;
            // this is for the github
        }
        Edge[] mst = kruskalsALgo(edges,v);
        for (int i = 0; i < mst.length; i++) {
            System.out.println(mst[i].source + " " + mst[i].destination + " " + mst[i].weight);
        }
    }
}
