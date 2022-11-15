public class MinimumNumberofJumps {
    static int minJumps(int[] arr){
        if(arr.length<=1){
            return 0;
        }
        
         if(arr[0]==0){
            return -1;
        }
         
        int steps = arr[0];
        int jumps=1;
        int maxReach = arr[0];
        for( int i=1;i<arr.length;i++){
            steps--;
            if(i==arr.length-1){
                return jumps;
            }
            
            maxReach = Math.max(maxReach  , i+arr[i]);
            if(steps==0){
                jumps++;
                if(i>=maxReach){
                    return -1;
                }
                
                
                steps = maxReach-i;
            }
        }
        return jumps;
    }
}
