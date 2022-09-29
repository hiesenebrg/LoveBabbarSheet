import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ExtractUniqueCharacters {
    public static void extractuniquecharacters(String string) {
        HashMap<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if(map.containsKey(string.charAt(i))){
                map.put(string.charAt(i) , map.get(string.charAt(i))+1);
            }else{
                map.put(string.charAt(i) , 1);
            }
        }
        Set<Character> keys = map.keySet();
        System.out.println(keys);
       
           
            
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        extractuniquecharacters(string);
    }
}
