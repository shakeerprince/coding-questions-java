
/*
 * Input : prices = [7,1,5,3,6,4]
 * Output : 5
 * Explanation : Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * 
 * Input : prices = [7,6,4,3,1]
 * Output : 0
 * Explanation : In this case, no transaction is done, i.e. max profit = 0.
 * 
 * Input : prices = [1,2,3,4,5]
 * Output : 4
 * Explanation : Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * 
 * 
 * 
 
public class BestTimeToSellStoks {
    public static void main(String[] args){
         int[] arr = {7,1,5,3,6,4};
         System.out.println(maxProfit(arr));
         }
         public static int maxProfit(int[] prices) {
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                    }
                    else if (prices[i] - min > max) {
                        max = prices[i] - min;
                        }
                        }
                        return max;

    }
    
    
}
*/
public class BestTimeToSellStokes{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minPrice ){
                minPrice = arr[i];
            }
            if(arr[i] - minPrice > maxProfit){
                maxProfit = arr[i] - minPrice;
            }
        }
        System.out.println(maxProfit);
      }
}