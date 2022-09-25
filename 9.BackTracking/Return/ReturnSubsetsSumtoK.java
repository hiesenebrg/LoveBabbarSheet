// package Return;
import java.util.*;

import javax.xml.transform.Source;

public class ReturnSubsetsSumtoK {
    public static void subsetsumstoKhelper(int[] input ,int index , int n, int k ,  ArrayList< ArrayList<Integer>>Ans , ArrayList<Integer>smallans){
        if(n == 0){
            if(k==0 && smallans.size()!=0){
                Ans.add(smallans);
                
}
             return;
        }
        subsetsumstoKhelper(input , index+1 ,n-1, k , Ans,smallans);
        ArrayList<Integer> smallAns = new ArrayList<>(smallans);
        smallAns.add(input[index]);
        // System.out.println(smallans);
        subsetsumstoKhelper(input , index+1 ,n-1, k-input[index] , Ans,smallAns);
       
    }
	public static  ArrayList< ArrayList<Integer>>  subsetsSumK(int input[], int n, int k) {
		// Write your code here
        ArrayList< ArrayList<Integer>>Ans  = new  ArrayList<>();
        ArrayList<Integer> smallans = new ArrayList<>();
        subsetsumstoKhelper(input , 0,n ,k, Ans , smallans);
        return Ans;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
    for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        
    }
    System.out.println("Enter the sum value");
    int k = sc.nextInt();
    System.out.println(subsetsSumK(input,n, k)); 
    }
}  

