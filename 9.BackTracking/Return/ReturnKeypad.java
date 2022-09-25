import java.util.*;
public class ReturnKeypad {
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
    public static String[] returnkeypad(int n){
            if(n==0){
                String[] ans = new String[1];
                ans[0] = "";
                return ans;
            }
            String[] output = returnkeypad(n/10);
            int rem = n%10;
            String patt = pattern(rem);
            int k = 0;
            String[] ans = new String[output.length * patt.length()];
            
            for (int i = 0; i < output.length; i++) {
                for (int j = 0; j <patt.length(); j++) {
                    ans[k] = output[i] + patt.charAt(j);
                    k++;
                }
            }
            return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] ans = returnkeypad(number);
        for (String string :ans){
            System.out.println(string);
        }
    }
}
