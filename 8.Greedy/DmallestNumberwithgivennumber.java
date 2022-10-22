import java.util.Scanner;

public class DmallestNumberwithgivennumber {
    public static String samllestnumber(int s , int d) {
        if(s<9){
            return "-1";
        }
        String ans = "";
    for (int i = d-1; i >=0; i++) {
        if(s>9){
            ans = '9' + ans;
            s-=9;
        }else{
            if(i==0){
                ans+=Integer.toString(s) + ans;
            }else{
                ans = Integer.toString(s-1)+ans;
                i-=1;
                while(i>0){
                    ans ='0'+ans;
                    i-=1;
                }
                ans = '1' + ans;
                break;
            }
        }
    }
    return ans;
    }
        // int [] ans = new int[d];
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();
        
            System.out.print(samllestnumber(s,d));
        
        // System.out.println();
    }
}
