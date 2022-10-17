import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatforms {
    public static int minimumPlatform(int[] arr , int[] dept) {
        Arrays.sort(arr);
        Arrays.sort(dept);
        int j= 0;
        int i =1;
        int number_of_platforms = 1;
        while (i<arr.length) {
            if(dept[j]<arr[i]){
                i+=1;
                j+=1;
            }else{
                i+=1;
                number_of_platforms +=1;
            }
        }
        return number_of_platforms;
        
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            
            int[] dept = new int[m];
            for (int i = 0; i < dept.length; i++) {
                dept[i ] = sc.nextInt();
            }
            System.out.println(minimumPlatform(arr ,dept));
        }
}

