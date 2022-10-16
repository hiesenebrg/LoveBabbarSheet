import java.net.SocketTimeoutException;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
 class JobComparator implements Comparator<Job>{
    public int compare(Job a, Job b)
    {
        return a.profit > b.profit ? -1 : a.profit == b.profit ? 0 : 1;
    }
}
class Job{
    int id ;
    int deadline;
    int profit;
    public Job (int id , int deadline , int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
    }
}
class ans{
     int profit;
     int day;

    public ans(int day , int profit){
        this.day = day;
        this.profit = profit;
    }
}
    
 class JobSequencing {
   

    
    public static  ans jobSequencing(Job[] job) {
        Arrays.sort(job ,new JobComparator());
        
        boolean [] done =new boolean[job.length];
        int day = 0 ;
        int profit = 0;
        for (int i = 0; i < job.length; i++) {
            for (int j = Math.min(job.length , job[i].deadline-1); j>=0; j--) {
                if(done[j] ==false){
                    day+=1;
                    profit +=job[i].profit;
                    done[j] = true;
                    break;
                }
            }
        }
        return new ans(day , profit);

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        Job [] arr = new Job [n];
        // ArrayList<Job> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
        int deadline = sc.nextInt();
        int profit = sc.nextInt();
        Job job = new Job(id, deadline, profit);
        arr[i] = job ;
        // array.add(job);
        }
        ans answer = jobSequencing(arr);
        System.out.println(answer.day + " "+ answer.profit);
        // jobSequencing(arr);
        
        
    }
}
