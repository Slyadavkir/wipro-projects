public class RotationCount {

    public static int findRotationCount(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = (low + high) / 2;

            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else if (arr[mid] >= arr[low]) {
                low = mid + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};

        int rotations = findRotationCount(arr);

        System.out.println("Rotation count: " + rotations);
    }
}