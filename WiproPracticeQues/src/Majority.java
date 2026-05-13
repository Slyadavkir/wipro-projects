public class Majority {
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        int n = arr.length;

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }
}