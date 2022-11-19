public class MaxProfitButSellingTwicw {
    public static int maxProfitButSellingTwice(int[] price){
        int min_price =0 ;
        int  max_profit_at_ith= price[0];
        int [] max_profit_sell_ith_day = new int[price.length];
        for (int i = 1;i<price.length;i++){
                if(price[i]<min_price){
                    min_price= price[i];
                }
                max_profit_at_ith = price[i] - min_price;
               if(max_profit_at_ith>max_profit_sell_ith_day[i-1]){
                    max_profit_sell_ith_day[i] = max_profit_at_ith;
               }else{
                max_profit_sell_ith_day[i] = max_profit_sell_ith_day[i-1];
               }
        }


        int max_price =0 ;
        max_profit_at_ith= price[price.length-1];
        int [] max_profit_buy_ith_day = new int[price.length];
        for (int i = price.length-2;i>=0;i--){
                if(price[i]>max_price){
                    max_price= price[i];
                }
                max_profit_at_ith = max_price - price[i] ;
               if(max_profit_at_ith>max_profit_buy_ith_day[i+1]){
                max_profit_buy_ith_day[i] = max_profit_at_ith;
               }else{
                max_profit_buy_ith_day[i] = max_profit_buy_ith_day[i+1];
               }
        }
        int overall_profit = 0;
        for (int i = 0; i < price.length; i++) {
            if(max_profit_sell_ith_day[i] + max_profit_buy_ith_day[i]> overall_profit){
                overall_profit = max_profit_sell_ith_day[i] + max_profit_buy_ith_day[i];
            }
        }
return overall_profit;
    }
}
