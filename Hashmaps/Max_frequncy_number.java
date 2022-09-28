// package Hashmaps;

import java.util.*;

public class Max_frequncy_number {
    public static int  maxfrequncynumber(int[] arr) {
        HashMap<Integer , Integer> maps = new HashMap<Integer , Integer>();
        for(int i:arr){
            if(maps.containsKey(i)){
                maps.put(i , maps.get(i)+1);
            }else{
                maps.put(i , 1);
            }
        }
        int maxValue = -1;
        int key = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(maps.containsKey(arr[i]) && maps.get(arr[i])>maxValue){
                maxValue = maps.get(arr[i]);
                key = arr[i];
            }
        }
        return key;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxfrequncynumber(arr));
    }
}
