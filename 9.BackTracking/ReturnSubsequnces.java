import java.io.ObjectInputFilter.FilterInfo;
import java.util.Scanner;

public class ReturnSubsequnces {
    public static String[] Returnsubsequnces(String string){
        if(string.length()==0){
            String[] ans = new String[1];
            ans[0] = "";
            return ans;
        }
        String [] output = Returnsubsequnces(string.substring(1));
        String[] ans = new String[output.length*2];
        for (int i = 0; i < output.length; i++) {
            ans[i] = output[i];
        }
        for (int i = 0; i < output.length; i++) {
            ans[output.length+i] = string.charAt(0) + output[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] ans = Returnsubsequnces(string);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
