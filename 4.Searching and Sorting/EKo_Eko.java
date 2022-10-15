import java.util.Scanner;

public class EKo_Eko {
    public static  int eko_eko(int[] arr , int n, int k) {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
                
        }
        int i = 0;
        int j = max;
        int ans = 0;
        while(i<=j){
            int mid = (i+j)/2;
            int sum = 0;
            for (int l = 0; l < arr.length; l++) {
                if(arr[l]>mid){
                    sum +=(arr[l] - mid);
                }
                
            }
            if(sum>=k){
                ans = mid;
                i = mid+1;
            }
            else{
                j= mid-1;
            }
            // System.out.println(mid);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
       for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
       }
       int k = sc.nextInt();
       System.out.println(eko_eko(arr, n, k));
    }
}
