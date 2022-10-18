import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Comaprable  implements Comparator<Stock>{
        public int  compare(Stock a , Stock b){
            return a.stock<b.stock ? -1 : a.stock<b.stock ?0:1;
        }
}




class Stock{
    int stock;
    int day;
    public Stock(int stock , int day){
            this.stock = stock;
            this.day = day;
    }
}



public class MaximumStockBuyonIthDay {
    public static int maximumstockBuy(Stock [] stocks, int k) {
        Arrays.sort(stocks , new Comaprable());
        int sum = 0;
        int count = 0;
        for (int i = 0; i < stocks.length; i++) {
            for (int j = 1; j <= stocks[i].day; j++) {
                int summ = sum;
                sum+=(stocks[i].stock);
                if(sum>k){
                    sum = summ;
                    break;
                }else{
                    count+=1;
                }
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stock[] stocks = new Stock[n];
        for (int i = 0; i < n; i++) {
            int stock = sc.nextInt();
            Stock sto = new Stock(stock, i+1);
            stocks[i] =sto;
        }
        int k = sc.nextInt();
        System.out.println(maximumstockBuy(stocks , k));
    }
}
