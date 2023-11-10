package Leetcode0121;

public class leetcode0121 {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }
    
            int max = 0 ;
            int min_price = prices[0] ;
    
            
            for(int i = 0; i < prices.length ; i++ ){
                if (prices[i] < min_price) {
                    min_price = prices[i];
                } else {
                    max = Math.max(max, prices[i] - min_price);
                }
                
            }
            return max ;
        }
    
}
