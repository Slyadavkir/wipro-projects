import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] A, int[] B) {
        int p = A.length;
        int q = B.length;

        for (int i = 0; i < p; i++) {
            // If current element of A is greater than first element of B
            if (A[i] > B[0]) {
                // Swap A[i] and B[0]
                int temp = A[i];
                A[i] = B[0];
                B[0] = temp;

                // Move B[0] to its correct position in B
                int first = B[0];
                int k;

                for (k = 1; k < q && B[k] < first; k++) {
                    B[k - 1] = B[k];
                }
                B[k - 1] = first;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};

        merge(A, B);

        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }
}