import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static int[] mergetwosortedArray(int[] arr1 , int[] arr2) {
        
        int [] ans = new int[arr1.length + arr2.length ];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0 ,j = 0 , k = 0;
        while (i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]){
                    ans[k] = arr1[i];
                    k+=1;
                    i+=1;
        }else if(arr1[i] == arr2[j]){
            ans[k ]= arr1[i];
            k+=1;
            j+=1;
            i+=1;
        }else{
            ans[k] = arr2[j];
            k+=1;       
            j+=1;
        }
        }
        while(i<arr1.length){
            ans[k] = arr1[i];
            k+=1;
            i+=1;
        }
        while(j<arr2.length){
            ans[k] = arr2[j];
            k+=1;
            j+=1;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[]ans = mergetwosortedArray(arr1 , arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
