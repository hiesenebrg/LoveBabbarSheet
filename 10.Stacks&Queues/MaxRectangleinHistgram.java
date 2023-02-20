import java.util.*;
public class MaxRectangleinHistgram {
    public static long getMaxArea(long hist[], long n) 
    {
    Stack<Long> s=  new Stack<>();
    int i = 0;
    long ma = 0;
    while(i<n){
        if(s.isEmpty() || hist[i]>=hist[int(s.peek())]){
            s.push(i);
            i++;
        }else{
            long top = s.peek();
            s.pop();
            long ans = hist[int(top)]*(s.isEmpty()?i:i-s.peek()-1);
            ma = Math.max(ma,ans);
        }
        // after all these last element or the element which are greater still remained unchecked
        // so we have to run the loop for that
    }
    while(!s.empty()){
        long top = s.peek();
            s.pop();
            long ans = hist[top]*(s.isEmpty()?i:i-s.peek()-1);
            ma = Math.max(ma,ans);
    }
    return ma;
    }
        
}
