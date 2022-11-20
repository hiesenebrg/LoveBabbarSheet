public class MaxSumRectangle {
    int kadanesALgo( int C, int []arr){
        int curr_sum = arr[0];
        int total_sum = arr[0];
        for(int i = 1 ;i<C;i++){
            if(curr_sum>0){
                curr_sum+=arr[i];
            }else{
                curr_sum = arr[i];
            }
            if(curr_sum>total_sum) total_sum = curr_sum;
        }
        return total_sum;
    }
    int maximumSumRectangle(int R, int C, int M[][]) {
        int ma = Integer.MIN_VALUE;
        for(int i =0;i<R;i++){
            int[] ans = new int[C];
            for(int j = i; j<R;j++){
                
                for(int k = 0;k<C;k++){
                    ans[k]+=M[j][k];
                }
                ma = Math.max(ma, kadanesALgo(C, ans));
            }
        }
        return ma;
    }
}
