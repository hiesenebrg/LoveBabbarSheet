import java.util.Scanner;

public class DmallestNumberwithgivennumber {
    public static int[] samllestnumber(int s , int d) {
        int [] ans = new int[d];
        int i = ans.length-1;
        int j = 0;
        while(i<j){
            if(s>9){
                ans[i] = 9;
                s-=9;
                i-=1;
            }
            else if(s<9){
                if(j+1 ==i){
                    ans[j] = s;
                    return ans;
                }
                ans[j] =1;
                s-=1;
                j+=1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();
        int[] ans = samllestnumber(s,d);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
        // System.out.println();
    }
}
