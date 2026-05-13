public class SmallestSecondSmallest {
    public static void main(String[] args) {

        int arr[] = {7, 6, -9, 5, 10, 1};

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Smallest: " + first);
            System.out.println("Second Smallest: " + second);
        }
    }
}