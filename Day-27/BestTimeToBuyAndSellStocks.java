import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int buy = Integer.MAX_VALUE;
        int profit =0;
        int max_profit=0;
            for(int i=0;i<prices.size();i++)
            {
                if(prices.get(i)<buy)
                {
                  buy = prices.get(i);  
                }
                profit = prices.get(i)-buy;
                if(max_profit<profit)
                {
                    max_profit = profit;
                }
            }
       return max_profit;
    }
}
