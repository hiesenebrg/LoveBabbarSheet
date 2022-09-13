public class SellandBuyStocks {
    public static int maxProfit(int[] prices) {
        int min_so_far = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            min_so_far = Math.min(min_so_far, prices[i]);
            profit = Math.max(profit, prices[i] - min_so_far);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        System.out.println(maxProfit(prices));
    }
}
