
import java.util.*;

public class DijkstrasAlgowtihm {
    public static int minVertex(int[] weight , boolean[] isVisited){
        int minIndex = -1;
        for (int i = 0; i < weight.length; i++) {
            if((!isVisited[i]) && (minIndex == -1 || weight[minIndex]> weight[i])){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static  void dijkistaAlgo(int[][] adjMatrix){
        boolean[] isVisited = new boolean[adjMatrix.length];
        int[] distance = new int[adjMatrix.length];
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        
        
        distance[0] =0;
        for (int i = 0; i < adjMatrix.length; i++) {
            
            int minvertex = minVertex(distance, isVisited);
            isVisited[minvertex] = true;

            for (int j = 0; j < adjMatrix.length; j++) {
                if((adjMatrix[minvertex][j] !=0 && !isVisited[j])){
                    if(adjMatrix[minvertex][j]+distance[minvertex]<distance[j]){
                        distance[j] = adjMatrix[minvertex][j]+distance[minvertex];
                        
                    }
                }
            }
            

        }
        for(int i=0;i<adjMatrix.length;i++){
            System.out.println(i+" "+distance[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int [][] adjMatrix = new int[v][v];
        for (int i = 0; i < e; i++) {
            System.out.println("Enter the vertices of the " + i + "th" + "edge");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            adjMatrix[v1][v2] = weight;
            adjMatrix[v2][v1] = weight;
        }
        dijkistaAlgo(adjMatrix);
        }
    }
    


