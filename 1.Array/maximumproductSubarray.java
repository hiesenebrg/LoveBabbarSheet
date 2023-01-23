public class maximumproductSubarray {
    long maxProduct(int[] arr, int n) {
        long ma  = arr[0] , mi = arr[0];
        long ans = arr[0];
        for( int i =1 ; i<n;i++){
            if(arr[i]<0){
                long temp = ma;
                ma = mi;
                mi = temp;
                
            }
            ma = Math.max(arr[i] , ma*arr[i]);
           mi = Math.min(arr[i] , mi*arr[i]);
           ans = Math.max(ans  , ma);
 
        }
        return ans;
     }
}
