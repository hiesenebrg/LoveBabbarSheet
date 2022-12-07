public class MaxRectangleinHistgram {
    public static long getMaxArea(long hist[], long n) 
    {
    Stack<Long> s=  new Stack<>();
    long i = 0;
    long ma = 0;
    while(i<n){
        if(s.isEmpty() || hist[i]>=hist[s.peek()]){
            s.push(i);
            i++;
        }else{
            long top = s.peek();
            s.pop();
            long ans = hist[top]*(s.isEmpty()?i:i-s.peek()-1);
            ma = Math.max(ma,ans);
        }
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
