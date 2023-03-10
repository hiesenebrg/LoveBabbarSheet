public class CountandSay {
    / 1
// 11
// 21
// 1211
// 111221
// 312211
// 13112221
// 1113213211

class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }if(n==2){
            return "11";
        }
        String s = "11";
        for(int i=3;i<n;i++){
            String t = "";
            s+="&";
            int c = 1;
            for(int j =1;j<s.length();j++){
                if(s.charAt(j)!= s.charAt(j-1)){
                    t+=String.valueOf(c);
                    t+=s.charAt(j-1);
                    c=1;
                }else{
                    c+=1;
                }
            }
            s=t;
        }
        return s;
    }
}
}
