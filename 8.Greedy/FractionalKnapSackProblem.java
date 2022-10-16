import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class ratioComparator implements Comparator<Knapsack>{
    public int compare(Knapsack a, Knapsack b)
    {
        return a.ratio > b.ratio ? -1 : a.ratio == b.ratio ? 0 : 1;
    }
}
class Knapsack{
    int value ;
    int weight;
    int ratio;
    public Knapsack (int value , int weight ){
            this.value = value;
            this.weight = weight;
            this.ratio = value/weight;
    }
}

public class FractionalKnapSackProblem {
    public static float fractionalknapsackProblem(Knapsack[] arr , int weight) {
        Arrays.sort(arr , new ratioComparator());
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].weight>weight && weight>=0){
                
                    sum+=(float)((weight*1.0)/(arr[i].weight*1.0))*arr[i].value;
                    break;
            }else if(arr[i].weight<=weight){
                sum+=arr[i].value;
                weight-=arr[i].weight;
               
            }

            }
            return sum;
        }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int mw = sc.nextInt();
        Knapsack[] arr = new Knapsack[n];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();

            Knapsack knapsack = new Knapsack(value, weight);
                arr[i] = knapsack;
        }
        
        System.out.println(fractionalknapsackProblem(arr, mw));
    }
}
