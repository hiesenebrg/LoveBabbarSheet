import java.util.ArrayList;
import java.util.Scanner;

class data{
    int a;
    int b;
    public data(int a , int b){
        this.a = a;
        this.b = b;
    }
}


public class WieneTradinginGregovia {
    public static int wieneTradinginGregovia(int[] arr) {
        ArrayList<data> buy=  new ArrayList<>();
        ArrayList<data> sell=  new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
            sell.add(new data(arr[i] , i));
            }else{
                buy.add(new data(arr[i] , i));
            }
        }
        int i = 0, j = 0;
        int ans = 0;
        while(i<buy.size() && j<sell.size()){
                if(buy.get(i).a>(-1*sell.get(j).a)){
                    ans+=((-1*sell.get(j).a)*(Math.abs(buy.get(i).b-sell.get(j).b)));
                    // System.out.println(ans + " 1");
                        // ans+=(buy.get(i).a-(-1*sell.get(j).a)*Math.abs((buy.get(i).b-(sell.get(j).b))));
                        buy.get(i).a = Math.abs(buy.get(i).a -(-1* (sell.get(j).a )));
                
                        sell.get(j).a = 0;
                        j+=1;
                }else{
                    ans+=((buy.get(i).a)*(Math.abs(buy.get(i).b-sell.get(j).b)));
                    sell.get(j).a = -1*(Math.abs((-1*sell.get(j).a) - buy.get(i).a));
                
                    buy.get(i).a = 0;
                    // System.out.println(ans + " " + sell.get(j).a);
                    i+=1;
                   
                    
                    
                }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(wieneTradinginGregovia(arr));
    }
    
}
