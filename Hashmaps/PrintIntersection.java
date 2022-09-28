// package Hashmaps;


import java.util.*;

public class PrintIntersection {
    public static void printintersection(int[] arr1 , int[] arr2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr1) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{map.put(i, 1);}
            
        }
        
            
        
        for (int i = 0; i < arr2.length; i++) {
            
            if((map.containsKey(arr2[i]))&& (map.get(arr2[i])>0)){
                System.out.println(arr2[i] + " ");
                    
                    map.put(arr2[i], map.get(arr2[i])-1);
            }
            continue;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first aray");

        int m = sc.nextInt();
        System.out.println("Enter the length of the second aray");

        int n =sc.nextInt();
        int arr1[] = new int[m];

        int arr2[] = new int[n];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the" +i+1 +"th"+  "of the first aray");

            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the" +i+1 +"th"+  "of the second aray");

            arr2[i] = sc.nextInt();
        }
        

        printintersection(arr1,arr2);
    }
}
