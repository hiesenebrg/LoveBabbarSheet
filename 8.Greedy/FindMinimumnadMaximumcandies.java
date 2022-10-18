import java.security.SecureRandomParameters;
import java.util.*;
class minandmax{
    int min;
     int max;
     public minandmax(int min  , int max){
        this.min = min ; 
        this.max = max;
     }
}
public class FindMinimumnadMaximumcandies {
    public static minandmax findminimumandmaximumcandies(int [] candies , int k , int n) {
        Arrays.sort(candies);
        int i = 0;
        int min = 0 , max = 0;
        int j = candies.length-1;
        while(i<=j){
                
                min+=candies[i];
                j-=k;
                i+=1;
        }
         i = 0;
         j = candies.length-1;
         while(i<=j){
            
            max+=candies[j];
            j-=1;
            i+=k;
         }
         return new minandmax(min, max);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] candies = new int[n];
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        minandmax ans  = findminimumandmaximumcandies(candies, k, n);
        System.out.println(ans.max  + " " + ans.min);
    }
}
