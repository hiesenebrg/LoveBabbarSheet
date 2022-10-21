import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SmallestSumGreaterthanallElements {
    public static int  smallestSumGreaterthanallElements(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int subsetsum = arr[0];
        int count=1;
        for (int i = 1; i < arr.length; i++) {
           
            if(subsetsum<sum-subsetsum){
                subsetsum+=arr[i];
                
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[ ] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(smallestSumGreaterthanallElements(arr));
    }

}
