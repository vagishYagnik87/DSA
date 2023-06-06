import java.util.HashMap;
import java.util.Map;

public class Q20 {
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 1) {
                return 0;
            }
            int maxRL = prices[prices.length - 1];
            int toReturn = Integer.MIN_VALUE;
            for (int i=prices.length-2; i>=0; i--) {
                int profit = maxRL - prices[i];
                toReturn = Math.max(profit, toReturn);
                maxRL = Math.max(maxRL, prices[i]);
            }
//            return Math.max(0, toReturn);
            Map<Integer, Integer> nums = new HashMap<>();
            nums.put
        }
    }
}
