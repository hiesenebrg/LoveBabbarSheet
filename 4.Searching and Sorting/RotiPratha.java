public class RotiPratha {
    public static int  rotiprata(int[] rating , int paratha) {
        int i = 0;

        int  j = Math.pow(10, 8);
        int mid = 0;
        int ans = 0;
        while(i<=j){
           mid = (i+j)/2;
           int parathass = 0;
           for (int k = 0; k < rating.length; k++) {
            int time = rating[k];
            int index = 2;
            
            while(time<=mid){
                    parathass+=1;
                time+=(time*index);
                index+=1;
            }
            

           } 
           if(parathass>=paratha){
            ans = mid;
            j=mid-1;
           }else 
           i = mid+=1;
           
        }
    }

}
