public class SumofLongestBloodLine {
    public  int[]  solve(Node root){
        if(root==null){
            int [] temp  = {0,0};
            return temp;
        }
        int[] left = solve(root.left);
        int[] right = solve(root.right);
        if(left[0]>right[0]) {
             int[] temp1 = {left[0]+1 , left[1] + root.data};
             return temp1;
            
        }
         if(left[0]<right[0]) {
              int[] temp2 = {right[0]+1 , right[1] + root.data};
              return temp2;
         }
         else{
              int[] temp3  = { left[0]+1 , Math.max(left[1] , right[1]) + root.data};
              return temp3;
              
         }
    }
    public int sumOfLongRootToLeafPath(Node root)
    {
        int[] ans = solve(root);
        return ans[1];
    }
}
