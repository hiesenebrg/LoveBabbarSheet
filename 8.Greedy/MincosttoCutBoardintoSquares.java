import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.plaf.ViewportUI;



public class MincosttoCutBoardintoSquares {
    public static int mincosttocutBoardontoSquares(Integer [] horizontal , Integer[] vertical) {
        Arrays.sort(horizontal , Collections.reverseOrder());
        Arrays.sort(vertical  , Collections.reverseOrder());
        int verti = 1;
        int hori = 1;
        int  i= 0 , j = 0;
        int cost = 0;
        // please note that if we vertically then increase horizontal_count and vice-versa
        while(i<horizontal.length && j<vertical.length){
            if(horizontal[i]<vertical[j]){
                cost+=vertical[j]*verti;
                hori+=1;
                j+=1;
            }else {
                cost+=horizontal[i]*hori;
                verti+=1;
                i+=1;
            }
            
        }
        while(i<horizontal.length){
            cost+=horizontal[i]*hori;
            i+=1;
        }
        while(j<vertical.length){
            cost+=vertical[i]*verti;
            j+=1;
        }
        return cost;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of the horizontal cost");
        int m = sc.nextInt();
        Integer[] horizontal = new Integer[m];

        for (int i = 0; i < m; i++) {
            horizontal[i] = sc.nextInt();
        }
        System.out.println("Enter the number of the vertical cost");
        int n =sc.nextInt();
        Integer[] vertical = new Integer[n];
        for (int i = 0; i < vertical.length; i++) {
            vertical[i] = sc.nextInt();
        }
        System.out.println("The answer should be");
        System.out.println(mincosttocutBoardontoSquares(horizontal , vertical));
    }
}
