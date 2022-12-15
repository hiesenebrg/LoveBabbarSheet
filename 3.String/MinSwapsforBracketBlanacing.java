public class MinSwapsforBracketBlanacing {
    static int minimumNumberOfSwaps(String S){
        // code here
        int n = S.length();
        char[] s = S.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s[i] == '[') arr.add(i);
        }
        int count = 0, idx = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(s[i] == '['){
                count+=1;
                idx++;
            }else{
                count-=1;
                if(count<0){
                    ans+=arr.get(idx)-i;
                    char temp = s[i];
                     s[i] = s[arr.get(idx)];
                     s[arr.get(idx)]= temp;
                     count = 1;
                     idx+=1;
                    
                }
            }
        }
        return ans;
    }
}
