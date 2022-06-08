public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
       // Input: nums = [0,0,1,1,1,2,2,3,3,4]
      //  Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

       int[] nums = {0,0,1,1,1,2,2,3,3,4, 4};

       /* without extra space */
        int start = 0;
        int end = 0;
        int n = nums.length;
        while(end < n) {
            int curr = nums[end];
            while (end < n && nums[end] == curr) {
              end++;
            }
            nums[start] = curr;
            start++;
        }

        for (int i=0;i<nums.length;i++)
            System.out.print(nums[i] + " ");

        System.out.println("");


       /**** with extra space ***/
    //    int[] nums = {1,1,2};
        int[] tempArr = new int[nums.length];
        int j = nums.length-1;
        int k = 0;
        for (int i=0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) {
                tempArr[j] = nums[i+1];
                j--;
            } else {
                tempArr[k] = nums[i];
                k++;
            }
        }
        tempArr[k] = nums[nums.length-1];
        for (int i=0;i<nums.length;i++)
            System.out.print(tempArr[i] + " ");
    }
}
