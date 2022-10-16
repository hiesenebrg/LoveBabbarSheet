import java.util.ArrayList;
import java.util.Scanner;

public class WaterConnection {
    public static void dfs(int i,ArrayList<ArrayList<Integer>> graph , int mw, int e,int[]vis){
        vis[i] = 1;
        for (int j = 0; j < graph.size(); j++) {
            if(vis[graph.get(j).get(0)]==0){
                mw = Math.min(mw , graph.get(j).get(1));
            e = graph.get(j).get(0);
            dfs(e,graph , mw, e,vis);
            }   
        }   
    }
    public static ArrayList<ArrayList<Integer>> waterconnection(int n , int p , ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> c ) {
        int [] vis = new int[n+1];
        int[] in = new int[n+1];
        int[] out = new int[n+1];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(n+1);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            in[a.get(i)] = 1;
            out[b.get(i)] = 1;
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(b.get(i));
            temp.add( c.get(i));
            

            graph.add(a.get(i), temp);
        }
        for (int i = 0; i <n; i++) {
            if(in[i]==0 && out[i]!=0 && vis[i]==0){
                int s=i;
                int e = 0;
                int mw = Integer.MAX_VALUE;
                dfs(i,graph , mw, e,vis);
                ArrayList<Integer> answer = new ArrayList<>();
                answer.add(s);
                answer.add(e);
                answer.add(mw);
                ans.add(answer);    
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p =sc.nextInt();
        int in_len = sc.nextInt();
        ArrayList<Integer> in = new ArrayList<>();
        for (int i = 0; i <in_len; i++) {
            in.add(sc.nextInt());
        }
        int out_len = sc.nextInt();
        ArrayList<Integer> out = new ArrayList<>();
        for (int i = 0; i < out_len; i++) {
            out.add(sc.nextInt());
        }
        int dia = sc.nextInt();
        ArrayList<Integer> diameter = new ArrayList<>();
        for (int i = 0; i < dia; i++) {
            diameter.add(sc.nextInt());
        }
        System.out.println(waterconnection(n, p, in, out, diameter));
        
    }
}
