import java.util.*;
// Question ==> Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,...,xN (0 <= xi <= 1,000,000,000).
// His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?
public class AggresiveCows {
    public static int aggressiveCows(int barn, int cow , int[] stalls) {
       Arrays.sort(stalls);
       int i = 1;
       int j = barn;
       int mid = 0;
       int coww = cow;
       int ans = 0;
        while (i<=j) {
            mid = (i+j)/2;
            int prev = stalls[0];
            for (int k = 1; k < stalls.length; k++) {
                if((stalls[k]-prev)>=mid){
                        coww-=1;
                        prev = stalls[k];
                        if(cow==0){
                            break;
                        }
                }
            }
            if(coww<=0){
                i= mid+1;
                ans = mid;
            }else{
                j = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int barn = sc.nextInt();
        int cow = sc.nextInt();
        int stall_length = sc.nextInt();
        int [] stalls = new int[stall_length];
        for (int i = 0; i < stalls.length; i++) {
            stalls[i] = sc.nextInt();
        }
        System.out.println(aggressiveCows(barn , cow , stalls));
    }
}
