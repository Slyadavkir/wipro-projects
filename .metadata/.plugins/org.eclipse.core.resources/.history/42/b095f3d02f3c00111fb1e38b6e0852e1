import java.util.HashSet;

public class ConsecutiveSubArray {

    public static void findLargestSubarray(int[] nums) {
        int n = nums.length;

        int start = 0, end = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            HashSet<Integer> set = new HashSet<>();
            set.add(nums[i]);

            for (int j = i + 1; j < n; j++) {

                if (set.contains(nums[j])) {
                    break;
                }

                set.add(nums[j]);

                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);

                if (max - min == j - i) {
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        System.out.println("The largest sub-array is [" + start + ", " + end + "]");
        System.out.print("Elements of the sub-array: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 0, 2, 1, 4, 3, 6, 1, 0 };
        findLargestSubarray(nums);
    }
}