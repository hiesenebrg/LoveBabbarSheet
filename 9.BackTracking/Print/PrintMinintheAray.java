// package Print;
import java.util.*;
public class PrintMinintheAray {
    public static void printMin(int[] arr , int index , int minSofar) {
        if(index == arr.length){
            System.out.println(minSofar);
            return;
        }
        if(arr[index] < minSofar){
            minSofar = arr[index];
        }
        printMin(arr, index+1, minSofar);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printMin(arr,0,Integer.MAX_VALUE); 
    }
}
