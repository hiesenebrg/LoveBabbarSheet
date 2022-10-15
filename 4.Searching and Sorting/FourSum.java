import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FourSum {
    public static ArrayList<ArrayList<Integer>> foursum(int[] num , int target) {
        Set<ArrayList<Integer>> ans = new HashSet<>();
            
       
        Arrays.sort(num);
        for (int i = 0; i < num.length-3; ++i) {
            if(i>0 && num[i]==num[i-1]){
                continue;
            }
            for (int j = 0; j < num.length-2; ++j) {
                if(j>0 && num[j]==num[j-1]){
                    continue;
                }
                int left = j+1;
                int right = num.length-1;
                while(left<right){
                    if(num[left] + num[right] + num[i] + num[j] <target){
                        left+=1;
                    }else if(num[left] + num[right] + num[i] + num[j] == target){
                        ArrayList<Integer> answer = new ArrayList<>(); 
                        // System.out.println("We are Here");
                        answer.add(num[i] );
                        answer.add(num[j] );
                        answer.add(num[left] );
                        answer.add(num[right] );
                        ans.add(answer);
                        left+=1;
                        

                    }else{
                        right-=1;
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> answ = new ArrayList<>();
        for (ArrayList<Integer> element : ans) {
            answ.add(element);
        }
    return answ;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Target = sc.nextInt();
        System.out.println(foursum(arr,Target));
    }
}
