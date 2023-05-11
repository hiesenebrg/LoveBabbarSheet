import java.util.*;
public class Documnets {
    static int distinct(String str ){
        String str2 = "";
        Set<String> uniqueDates = new HashSet<>();
        for(int i = 0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                str2 +=(str.charAt(i));
            }
            if (str.charAt(i)=='-') {
                str2 ="";
            }
            if(str2.length()==4){
                uniqueDates.add(str2);
                str2 = "";
            }
        }
        return uniqueDates.size();
    }
    public static void main(String[] args) {
        String str = "UN was 24-10-1945 fhjer 15-08-1947";
        System.out.println(distinct(str));
    }
}
