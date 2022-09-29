import java.util.HashMap;
import java.util.Scanner;

/**
 * PairWithDifferneceK
 */
public class PairWithDifferneceK {

    public static int pairWithDifferneceK(int[] arr , int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int i : arr) {
            
            boolean flag = false;
                if(k==0){
                    flag=true;
                }
            if(map.containsKey(i+k)){
                    maxCount+=map.get(i+k);
            }
        // this is because is the k==0 that means i+k == i-k that doubles the total value that's why a flag is used which means
        // that if i+k is taken then we don't have to take i-k
            if(map.containsKey(i-k) && !flag){
                maxCount+=map.get(i-k);
        }
        if(map.containsKey(i)){
            map.put(i, map.get(i)+1);
        }else{
            map.put(i, 1);
        }
        
        }
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter thr value of K");
        int k = sc.nextInt();
        System.out.println(pairWithDifferneceK(arr ,k));
    }
}