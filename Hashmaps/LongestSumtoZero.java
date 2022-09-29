import java.util.HashMap;
import java.util.Scanner;

/**
 * LongestSumtoZero
 */
public class LongestSumtoZero {
    public static int longestSumtoZero (int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum=0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(map.containsKey(sum)){
                if(maxValue <(i- map.get(sum))){
                    maxValue = (i- map.get(sum));
                }
            }else{
                map.put(sum , i);
            }
            
            
        }
        return maxValue;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("The longest Sum to Zero is : " + longestSumtoZero(arr));
}
    
}