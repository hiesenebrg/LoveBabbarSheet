import java.util.Scanner;

public class SearchingInaArraywhereAdjacentDifferatmostK {
    public static int search(int[] arr , int k , int num) {
        int i =0;
        while(i<arr.length){
            if(arr[i] == num){
                return i;
            }else{
                int diff = num - arr[i];
            i+=diff/2;
            }
            
            // for (int j = i; j < i+(diff/2); j++) {
                
            // }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int num = sc.nextInt();
        System.out.print(search(arr , k , num));
    }
}
