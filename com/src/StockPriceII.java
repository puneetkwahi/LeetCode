public class StockPriceII {
    /*
    Input:   price[] = {10, 22, 5, 75, 65, 80}
    Output:  87
    Trader earns 87 as sum of 12, 75
    Buy at 10, sell at 22,
    Buy at 5 and sell at 80
    Input:   price[] = {2, 30, 15, 10, 8, 25, 80}
    Output:  100
    Trader earns 100 as sum of 28 and 72
    Buy at price 2, sell at 30, buy at 8 and sell at 80
    Input:   price[] = {100, 30, 15, 10, 8, 25, 80};
    Output:  72
    Buy at price 8 and sell at 80.
    Input:   price[] = {90, 80, 70, 60, 50}
    Output:  0
    Not possible to earn.
     */
    public static void main(String[] args) {
       // int[] prices = {10, 22, 5, 75, 65, 80};
        // int[] prices = {100, 30, 15, 10, 8, 25, 80};
/*      int fbuy = Integer.MIN_VALUE;
        int fsell = 0;
        int sbuy = Integer.MIN_VALUE;
        int ssell = 0;
        int n = price.length;
        for (int i = 0; i < price.length; i++) {
            fbuy = Math.max(fbuy,-price[i]);
            fsell = Math.max(fsell,fbuy+price[i]);
            System.out.println(fbuy + " " + fsell);
            sbuy = Math.max(sbuy,fsell-price[i]);
            ssell = Math.max(ssell,sbuy+price[i]);
        }
 */

         int[] prices = {1,2,3,4,5};
        //output - 7
        //buy at local min - sell at local max

        int profitSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
           if(prices[i-1] < prices[i]) {
               profitSoFar += prices[i] - prices[i-1];
           }
        }

        System.out.println(profitSoFar);


    }
}
