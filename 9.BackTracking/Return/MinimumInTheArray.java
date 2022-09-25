// package Return;
import java.util.*;

public class MinimumInTheArray {
    public static int mininthearray(int[] arr, int index){
        if(index == arr.length){
            return Integer.MAX_VALUE;
        }
        int output = mininthearray(arr , index+1);
        if(arr[index]<output){
            return arr[index];
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(mininthearray(arr,0) );  
    }
}
