import java.util.HashMap;

public class AirthmaticSlices2 {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;
        HashMap<Integer , Integer>[] maps = new HashMap[nums.length];
        for( int i = 0;i<nums.length;i++){
            maps[i] = new HashMap<>();
        }
         for( int i = 1;i<nums.length;i++){
            for( int j = 0;j<i;j++){
                long cd = (long)nums[i] - (long)nums[j];
                if(cd<=Integer.MIN_VALUE || cd>=Integer.MAX_VALUE){
                    continue;
                }
                int apsEndingonJ = maps[j].getOrDefault((int)cd , 0);
                int apsEndingonI = maps[i].getOrDefault((int)cd , 0);
                ans+=apsEndingonJ;
                maps[i].put((int)cd ,apsEndingonJ + apsEndingonI+1 );
            }
         }
         return ans;
    }
}
