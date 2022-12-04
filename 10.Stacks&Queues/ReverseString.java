/**
 * ReverseString
 */
import java.util.*;;
public class ReverseString {

    public String reverse(String S){
        Stack<Character> stack = new Stack<>();
        for( int i = 0; i<S.length();i++){
            stack.push(S.charAt(i));
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}