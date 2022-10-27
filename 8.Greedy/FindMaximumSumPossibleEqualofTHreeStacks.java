import java.util.Iterator;
import java.util.Scanner;
import java .util.Stack;

public class FindMaximumSumPossibleEqualofTHreeStacks {
    public static int sum(Stack<Integer> one) {
        int ans = 0;
        Iterator<Integer> itr = one.iterator();
        while(itr.hasNext()){
            ans+=itr.next();
        }
        return ans;
    }
    public static int findMaximumSumPossibleEqualofTHreeStacks(Stack<Integer> one, Stack<Integer> two, Stack<Integer> three) {
        int ans = 0;
        int sum1 = sum(one);
        int sum2 = sum(two);
        int sum3 = sum(three);
        int top1 = 0, top2 = 0, top3 = 0;
        while(true){
            if(top1 == one.size() || top2 == two.size() || top3 == three.size()){
                ans = 0;
                break;
            }
            if(sum1==sum2 && sum2 ==sum3){
                ans = sum1;
                break;
            }
            if(sum1>=sum2 && sum1>=sum3){
                sum1 = sum1- one.pop();
                top1+=1;
            }
            else if(sum2>=sum1 && sum2>=sum3){
                sum2 = sum2- two.pop();
                top2+=1;
            }
            else if (sum3>=sum2 && sum3>=sum1){
                sum3 = sum3- three.pop();
                top3+=1;
            }
            System.out.println(sum1 + " " + sum2 + " " + sum3);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         Stack<Integer> one = new Stack<>();
         while(n!=0){
            n-=1;
            one.push(sc.nextInt());
            
         }

         int o = sc.nextInt();
         Stack<Integer> two = new Stack<>();
         while(o!=0){
            o-=1;
            two.push(sc.nextInt());
         }

         int p = sc.nextInt();
         Stack<Integer> three = new Stack<>();
         while(p!=0){
            p-=1;
            three.push(sc.nextInt());
         }
         System.out.println(findMaximumSumPossibleEqualofTHreeStacks(one, two, three));
    }
}
