// package Print;

import java.util.*;

public class PrintSubsequences {
    // here whenever the bse case hits everytime the ans will ne printed that's why I have taken String ans not String[] ans
    public static void Printsubsequences(String string , String ans){
            if(string.length()== 0){
                System.out.println(ans);
                return;
            }
            Printsubsequences(string.substring(1), ans);
            Printsubsequences(string.substring(1), ans+string.charAt(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        Printsubsequences(string , "");
    }
}
