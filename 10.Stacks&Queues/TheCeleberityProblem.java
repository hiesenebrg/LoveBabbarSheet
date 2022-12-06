public class TheCeleberityProblem {
    int celebrity(int M[][], int n)
    {
        Stack<Integer> stack = new Stack<>();
        for(int i =0;i<n;i++){
           stack.push(i); 
        } 
        while(stack.size()>=2){
            int a = stack.pop();
            int b = stack.pop();
            if(M[b][a]!=0){
                // if b knows b then b is not a celebrity
                stack.push(a);
            }else{
                stack.push(b);
            }
        }
        int pot = stack.pop();
        for(int i = 0;i<M.length;i++){
            if(i!=pot){
                if(M[i][pot]==0 || M[pot][i]==1) return -1;
            }
        }
        return pot;
    }
}
