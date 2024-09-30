import java.util.*;

public class BuySelling {
    public static int buyAndSellingStockPrices(int prices[]){
      int buyPrice = Integer.MAX_VALUE; 
      int maxProfit =0;

      for(int i=0; i<prices.length;i++){
        if (buyPrice<prices[i]) { //profit
            int profit = prices[i] - buyPrice; //today profit
            maxProfit = Math.max(maxProfit, profit); // Global Profit
        }else{
            buyPrice = prices[i];
        }
      }
      return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] ={7,1,5,3,6,4};
        System.out.println(buyAndSellingStockPrices(prices));
    }
}
