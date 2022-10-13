import java.util.Scanner;

/**
 * DoubleHelix
 */
public class DoubleHelix {

    public static int doubleHelix(int[] arr1 , int[] arr2) {
        int i =0 , j = 0;
        int sum1 = 0 , sum2 = 0, total_sum = 0;
        // please note that here that the pointer of smaller element will move(that is +=1) so that both i and j will meet each other
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                sum1+=arr1[i];
                    i+=1;
            }
            else if( arr1[i]>arr2[j]){
                sum2+=arr2[j];
                j+=1;
            }else{
                if(sum1<sum2){
                    total_sum = sum2+arr1[i];
                }else{
                    total_sum = sum1+arr1[i];
                }
                sum1 = 0;
                sum2 = 0;
                i+=1;
                j+=1;
            }
            

        }
        while(i<arr1.length){
            sum1+=arr1[i];
            i++;
        }
        while(j<arr2.length){
            sum2+=arr2[j];
            j++;
        }
        if(sum1>sum2){
            total_sum+=sum1;
        }else{
            total_sum+=sum2;
        }
        return total_sum;
    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] =sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] =sc.nextInt();
        }
        System.out.println(doubleHelix(arr1, arr2));
    }
}