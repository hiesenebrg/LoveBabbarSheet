public class MaxDifferofZeroessandOnes {
    int maxSubstring(String S) {
        int ans = 0;
        int value = 0;
        
        int curr_sum = 0;
       for(int i= 0; i<S.length();i++){
           if(S.charAt(i)=='0'){
               value=1;
           }else if(S.charAt(i)=='1'){
               value=-1;
           }
           if(curr_sum>0){
               curr_sum+=value;
           }else{
               curr_sum = value;
           }
           if(curr_sum>ans){
               ans=curr_sum;
           }
       }
       if(ans==0){
           return -1;
       }
       return ans;
    }
}
