public class IfGraphisTree {
    public static void dfsTraversal(int v, boolean[] visited, int[][] adjMatrix , int parent){
        visited[v] = true;
        for (int i  = 0; i<adjMatrix.length ; i++) {
       
            if(adjMatrix[v][i]>0 && !visited[i]){
                dfsTraversal(i, visited, adjMatrix , v);
            }
    }
    
}
public static boolean isConnected(int V,int E) {
        // Mark all the vertices as not visited and not part
        // of recursion stack
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        // Performing DFS traversal of the graph and marking
        // reachable vertices from 0 to true
        dfsTraversal(0, visited, -1);
 
        // If we find a vertex which is not reachable from 0
        // (not marked by dfsTraversal(), then we return
        // false since graph is not connected
        for (int u = 0; u < V; u++)
            if (!visited[u])
                return false;
 
        // since all nodes were reachable so we returned
        // true and and hence graph is connected
        return true;
    }
    public static boolean isTree(int E , int V)
    {
        // as we proved earlier if a graph is connected and
        // has V - 1 edges then it is a tree i.e. E = V - 1
        return isConnected(E, V) && E == V - 1;
    }
}
