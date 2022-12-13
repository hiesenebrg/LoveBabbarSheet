public class FirstNegativeInteger {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        ArrayList<Long> ans= new ArrayList<>();
       Queue<Long> q  = new LinkedList<>();
       for(int i = 0;i<K-1;i++){
           if(A[i]<0) q.add(A[i]);
       }
       for(int i = K-1;i<N;i++){
           if(A[i]<0) q.add(A[i]);
           if(!q.isEmpty()){
               ans.add(q.peek());
               if(q.peek() == A[i-K+1])
                   q.poll();
           }
            else{
                ans.add((long)0);

            }
           
           
       }
       long[] anss = new long[ans.size()];
       
    //   System.out.print(ans);
       int i=0;
        for(long value : ans){
            anss[i] = value;
            i++;
        }
           return anss;
    }
}
