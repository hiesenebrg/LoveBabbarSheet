import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrangingAmplifiers {
    public static void arrangingAmplifiers(Integer[] arr) {
        Arrays.sort(arr , Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] ==1){
            count+=1;
            System.out.print(1+" ");
           } 
        }
        if(arr.length-count==2 && arr[0] ==3 && arr[1]==2){
            System.out.print(2  + " " +3);
        }else{
        for (int i = 0; i < (arr.length-count); i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       arrangingAmplifiers(arr);
    }
}
