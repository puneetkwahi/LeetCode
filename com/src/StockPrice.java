public class StockPrice {
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

      //  int[] price = {10, 22, 5, 75, 65, 80};

        // int[] price = {100, 30, 15, 10, 8, 25, 80};

        int[] price = {7,6,4,3,1};
/*        int fbuy = Integer.MIN_VALUE;
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


        System.out.println(ssell);*/
      /*  int fbuy = Integer.MAX_VALUE;
        int fsell = 0;
        int sbuy = Integer.MIN_VALUE;
        int ssell = 0;
        int n = price.length;
        int j = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (price[i] < fbuy) {
                fbuy = price[i];
                j = i;
            }
            int currSum = 0;

            for (j = i; j < n; j++) {
                currSum = price[j] - fbuy;
                if(currSum > max)
                    max = currSum;
            }
        }
        System.out.println(max); */


        /*
        Input: prices = [7,1,5,3,6,4]
        Output: 5
         */
        //  int[] price = {10, 22, 5, 75, 65, 80};
        int max = 0;
        int fbuy = Integer.MAX_VALUE;
        int fsell = 0;

        for (int i = 0; i < price.length; i++) {
            if(fbuy > price[i]) {
                fbuy = price[i];
            }
            if(max < price[i] - fbuy) {
                max = price[i] - fbuy;
            }
        }
        System.out.println(max);
    }
}
