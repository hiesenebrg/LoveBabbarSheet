/**
 * PrimsAlgo
 */
import java.util.*;

public class PrimsAlgo {
    public static int minVertex(int[] weight , boolean[] isVisited){
        int minIndex = -1;
        for (int i = 0; i < weight.length; i++) {
            if((!isVisited[i]) && (minIndex == -1 || weight[minIndex]> weight[i])){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static  void Primsalgo(int[][] adjMatrix){
        boolean[] isVisited = new boolean[adjMatrix.length];
        int[] weight = new int[adjMatrix.length];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = Integer.MAX_VALUE;
        }
        int[] parent = new int[adjMatrix.length];
        parent[0]  = -1;
        weight[0] =0;
        for (int i = 0; i < adjMatrix.length; i++) {
            
            int minvertex = minVertex(weight, isVisited);
            isVisited[minvertex] = true;

            for (int j = 0; j < adjMatrix.length; j++) {
                if((adjMatrix[minvertex][j] !=0 && !isVisited[j])){
                    if(adjMatrix[minvertex][j]<weight[j]){
                        weight[j] = adjMatrix[minvertex][j];
                        parent[j] = minvertex;
                    }
                }
            }
            

        }
        for(int i = 1; i < adjMatrix.length; i++){
			if(parent[i] < i){
				System.out.println(parent[i] + " "+ i +" "+ weight[i]);
			}else{
				System.out.println(i + " "+ parent[i] +" "+ weight[i]);
			}
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
        Primsalgo(adjMatrix);
        }
    }
    
