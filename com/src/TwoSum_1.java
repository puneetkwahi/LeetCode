public class TwoSum_1 {
    public static void main(String[] args) {

        int numbers[] = {-1,-2,-3,-4,-5};
        int target = -8;
        int ans[] = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while (j>= 0 && numbers[i] + numbers[j] != target) {
            int sum = numbers[i] + numbers[j];
            System.out.println(numbers[i] + "+" +  numbers[j] + " = " + sum);
            if (j>=0 && numbers[i] + numbers[j] > target ) {
                j--;
            }
            else {
                i++;
            }
        }
        ans[0] = i+1;
        ans[1] = j+1;

        System.out.println(ans[0] + " "+ ans[1]);
    }
}
