import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {

    static int kthLargestElement(int nums[], int k) {
     /*   PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(i);
        }
        for (int i = k; i < nums.length; i++) {
            if (pq.peek() < nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();*/
  /*      Arrays.sort(nums);
        int n = nums.length;
        return nums[n-k];*/
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            q.add(nums[i]);
        }

        int j = 0;
        int l = 0;
        while (j < k) {
            l = q.remove();
            j++;
        }

        return l;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};
        System.out.println(kthLargestElement(arr, 1));

    }
}
