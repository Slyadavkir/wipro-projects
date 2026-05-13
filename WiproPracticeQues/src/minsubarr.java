public class minsubarr {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 4;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int minSum = windowSum;
        int startIndex = 0;

        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];

            if (windowSum < minSum) {
                minSum = windowSum;
                startIndex = i - k + 1;
            }
        }

        System.out.println("Sub-array size: " + k);
        System.out.println("Sub-array from " + startIndex + " to " + (startIndex + k - 1) + " and sum is: " + minSum);
    }
}
