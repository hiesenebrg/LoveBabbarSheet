import java.util.*;

// same as activity selection problem
class Pair
{
    int x;
    int y;
    
    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class JobComparator implements Comparator<Pair>{
    public int compare(Pair a, Pair b)
    {
        return a.y < b.y ? -1 : a.y == b.y ? 0 : 1;
    }
}
class maxChainLength
{
    int maxChainLength(Pair arr[], int n)
    {
        // sorting gurantees the maximum length chain
      Arrays.sort(arr , new JobComparator());
      
      int i = 0;
      int j = 1 , ans = 1;
      while(j<n){
          if(arr[i].y<arr[j].x){
              ans++;
              i = j;
              j++;
          }else j++;
      }
      return ans;
    }
}