import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ExtractUniqueCharacters {
    public static void extractuniquecharacters(String string) {
        HashMap<Character , Boolean> map = new HashMap<>();
        String ans="";
        for (int i = 0; i < string.length(); i++) {
            if(!map.containsKey(string.charAt(i))){
                map.put(string.charAt(i) ,true);
                    ans+=string.charAt(i);
            }
        }
        System.out.println(ans);
        
       
           
            
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        extractuniquecharacters(string);
    }
}
