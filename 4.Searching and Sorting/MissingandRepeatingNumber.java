import java.util.Scanner;
final  class maxandmin{
    int missing;
    int repeating;
public   maxandmin(int missing , int repeating){
    this.missing = missing;
    this.repeating = repeating;
}
}
public class MissingandRepeatingNumber {
// do the idea is that let X is missing number and  be repeating number
// then X-Y = S(where S = sum of n natural number(n(n+1)/2) - sum of given numbers)
// and X^2 - Y^2 = S^2 (where S^2 is summation of square of n natural number (n(n+1)(2n+1))/6 - summation of square of given number)
// now = X+Y = ( X^2 - Y^2)/( X-Y) 
// now we have X-Y and X-Y then add these two values to get the value of X and Y

    public static   maxandmin missingandrepeatingNumber(int n , int[] arr) {
        int sum = 0;
        int summmation_square = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            summmation_square+=(arr[i]*arr[i]);
        }
        int XminusY = (n*(n+1))/2 - sum;
        int XXminusYY = (n*(n+1)*(2*n+1))/6 - summmation_square;
        int missing = ((XXminusYY/XminusY) + XminusY)/2;
        int repeating=  missing - XminusY;
        return new maxandmin(missing, repeating);
        
    }
    public  static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maxandmin ans = missingandrepeatingNumber(n , arr);
        System.out.print(ans.missing + " " +  ans.repeating);
    }
}
