public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int nums[], int n) 
	{ 
    long[] left = new long[n];
    int j = 0;
    long product = 1;
    for(int num:nums){
        left[j] = ((long)num)*product;
        product = left[j];
        j++;
    }
    product = 1;
    // for( int i = 0;i<n;i++){
    //     System.out.print(left[i]+ " ");
    // }
    for( int i = n-1;i>0;i--){
       left[i] = product*left[i-1]; 
       product*=(long)nums[i];
    }
    left[0] = product;
    return left;
	} 
}
