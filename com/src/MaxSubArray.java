public class MaxSubArray {

    public static void main(String[] args) {
        /*
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

         */


        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
       // int[] arr = {-2, -1, -3, -4, -1, -2, -1, -5, -4};

        //prints all arrays and max sum O(N3)

       /* for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                    if (sum > max) {
                        max = sum;
                    }
                }
                System.out.println("");
            }
        }
        System.out.println(max);*/


        //prints max sum - O(N2)
   /*     for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                System.out.println("sum " + sum);
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println(max);*/

        /*
        print max sum in O(N)
         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
         */
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum = currSum + arr[i];
            if(currSum > max) {
                max = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(max);

    }
}
