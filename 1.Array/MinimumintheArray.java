import java.util.*;

public class MinimumintheArray {
    // public static void printminintheArray(int[] arr ,int startindex, int
    // minsofar) {
    // if(arr[startindex]==arr.length) {
    // System.out.println(minsofar);
    // return;
    // }
    // if(arr[startindex]<minsofar){
    // minsofar = arr[startindex];
    // }
    // printminintheArray(arr , startindex+1 , minsofar);

    // }
    // public static void main(String[] args) {
    //     int[] arr = { 3, 2, 1, 4, 5 };
    //     printminintheArray(arr, 0, 100);
    // }
    // public static void printsubsequences(String input, String stringSoFar) {
    //     if (input.length() == 0) {
    //         System.out.println(stringSoFar);
    //         return;
    //     }
    //     String smallInput = input.substring(1);
    //     printsubsequences(smallInput, stringSoFar);
    //     printsubsequences(smallInput, stringSoFar + input.charAt(0));
    // }
    public static void printarraySubset(int[]arr ,int index ,int sum ,int[]ans ) {
        if(index>=arr.length){
            if(sum==0){
                for (int i = 0; i < ans.length; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            return;
        }
        printarraySubset(arr , index+1 , sum , ans);
        int[] newans = new int[ans.length+1];
        for (int i = 0; i < ans.length; i++) {
            newans[i] = ans[i];
        }
        newans[newans.length-1] = arr[index];
        printarraySubset(arr , index+1 , sum-arr[index] , newans);
    }

    public static void main(String[] args) {
        //  Scanner s = new Scanner(System.in); 
        //  System.out.println("Enter String");
        //   String input = s.next();
        // String[] output = s.next(); 
        int[]arr = {1,2,3,4,5,6,7};
        int[]ans = new int[0];
        printarraySubset(arr,0, 6, ans);
        //  for(String outputString: output) { 
        //     System.out.println(outputString);
         }

}
