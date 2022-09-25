// package Print;
import java.util.*;

public class printKeypad {
    public static String pattern(int n){
        if(n==1){
            return "abc";
        }
        if(n==2){
            return "def";
        }
        if(n==3){
            return "ghi";
        }
        if(n==4){
            return "jkl";
        }
        if(n==5){
            return "mno";
        }
        if(n==6){
            return "pqrs";
        }
        if(n==7){
            return "tuv";
        }
        if(n==8){
            return "wxyz";
        }
        return "";
    }
    public static void printkeypad( int n ,String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        int rem = n%10;
        String value = pattern(rem);
        for (int i = 0; i < value.length(); i++) {
            printkeypad(n/10 ,value.charAt(i) + ans);
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printkeypad(n , "");
    }
}
