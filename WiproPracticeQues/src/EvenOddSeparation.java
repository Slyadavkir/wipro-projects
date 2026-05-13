import java.util.Arrays;

public class EvenOddSeparation {

    public static void separateEvenOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }

            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};

        separateEvenOdd(arr);

        System.out.println(Arrays.toString(arr));
    }
}