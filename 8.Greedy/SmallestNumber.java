public class SmallestNumber {
    static String smallestNumber(int S, int D){
        // code here
        if(9*D<S) return "-1";
        String ans= "";
        for( int  i = D-1;i>=0;i--){
            if(S>9){
                ans= '9' +ans;
                S-=9;
            }else{
                if(i==0){
                    ans =Integer.toString(S)+ans;
                }else{
                    ans = Integer.toString(S-1) + ans;
                    i--;
                    while(i>0){
                        ans = '0' + ans;
                        i--;
                    }
                    ans = '1' + ans;
                    
                    break;
                }
    
        }
        }
        return ans;
    
    }
}
