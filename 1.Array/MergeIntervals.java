import java.util.Scanner;

public class MergeIntervals {
    public static int mergeintervals(int[][] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[idx][1]>=arr[i][0]){
                    int end = Math.max(arr[idx][1], arr[i][1]);
                    arr[idx][1] = end;
            }else{
                idx+=1;
                arr[idx][0] = arr[i][0];
                arr[idx][1] = arr[i][1];
            }

        }
        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println("enter the " + i+1+"th" + "element");
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < 2; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("this is the answer");
        int idx = mergeintervals(arr);
        for (int i = 0; i <= idx; i++) {
            for (int j = 0; j < 2; j++) {
                
            
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
