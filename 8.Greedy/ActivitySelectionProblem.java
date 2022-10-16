import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Compare implements Comparator<Activity>{
    // @Override
    public int compare(Activity a , Activity b){
        return a.end<b.end? -1 :a.end==b.end?0 :1;
    }

    
    
}
class Activity{
    int start;
    int end;
    public Activity(int start  , int end){
        this.start = start ;
        this.end = end;
    }
}




public class ActivitySelectionProblem {

   
    public static int  activityselectionproblem(Activity [] activity){
        Arrays.sort(activity , new Compare());
        int count = 1;
        int i =0;
        int j = 1;
        while(j<activity.length){
                if(activity[i].end<activity[j].start){
                        count+=1;
                        i=j;
                        
                }
                j+=1;
        }
return count;
    } 
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Activity [] activity = new Activity[n];
        for (int i = 0; i < n; i++) {
           int start = sc.nextInt();
           int  end= sc.nextInt();
           Activity act = new Activity(start, end);
                activity[i] = act;
        }
        System.out.println(activityselectionproblem(activity));
    }
}
