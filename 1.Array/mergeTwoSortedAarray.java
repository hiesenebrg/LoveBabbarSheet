import java.util.Arrays;
import java.util.Scanner;

public class mergeTwoSortedAarray {
    public static void mergetwosortedarrays(int[] arr1 , int[] arr2) {
        // Time Complexity => O(mlom+ nlogn) , Space Complexity = > O(1)

        // int i = 0,j = arr1.length-1;
        // while(i<arr2.length && j>=0){
        //     if(arr2[i]<arr1[j]) {
        //         int temp = arr1[j];
        //         arr1[j] = arr2[i];
        //         arr2[i] = temp;
        //         i+=1;
        //         j-=1;
        //     }
        //     else if(arr1[i]>arr2[j]) i+=1;
        //     else j-=1;
        // }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
    // }
    // Time Complexity => O(logn*n) , Space Complexity = > O(1)


        int  m = arr1.length;
        int n = arr2.length;
        int gap  = (m+n)/2;
        
        while(gap>0){
            int  i =0;
            int j = gap;
        while(j<(n+m)){
            if(j<m && arr1[i]>arr1[j]){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;

            }
            else if(j>=m && i<m &&arr1[i]>arr2[j-m]){

                int temp = arr2[j-m];
                arr2[j-m] = arr1[i];
                arr1[i] = temp;
            }
            else if(j>=m && i>m &&arr2[i-m]>arr2[j-m]){

                int temp = arr2[i-m];
                arr2[i-m] = arr2[j-m];
                arr2[j-m] = temp;
            }
            i+=1;
            j+=1;
            

        }
            if(gap==1) gap = 0;
            else gap = gap/2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  m = sc.nextInt();
        int [] arr1 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int  n  = sc.nextInt();
        int [] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        mergetwosortedarrays(arr1 ,arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
