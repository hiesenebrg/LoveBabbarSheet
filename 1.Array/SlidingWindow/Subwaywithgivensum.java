import java.util.*
public class Subwaywithgivensum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
         int currentSum = arr[0], start = 0, i;
 
        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If currentSum exceeds the sum,
            // then remove the starting elements
            while (currentSum > s && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }
 
            // If currentSum becomes equal to sum,
            // then return true
            if (currentSum == s) {
                int p = i - 1;
                ans.add(start+1);
                ans.add(p+1);
                // System.out.println(
                //     "Sum found between indexes " + start
                //     + " and " + p);
                return ans;
            }
 
            // Add this element to curr_sum
            if (i < n)
                currentSum = currentSum + arr[i];
        }
 
       ans.add(-1);
        return ans ;
    
    }

}
