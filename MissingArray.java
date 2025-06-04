import java.util.*;

public class MissingElementsFinder {
    public static List<Integer> findMissingElements(int[] arr, int n) {
        boolean[] present = new boolean[n + 1]; // index 1 to n

        // Mark the present numbers
        for (int num : arr) {
            if (num <= n) {
                present[num] = true;
            }
        }

        // Find missing numbers
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missing.add(i);
            }
        }

        return missing;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6};
        int n = 6;

        List<Integer> missing = findMissingElements(arr, n);
        System.out.println("Missing elements: " + missing);
    }
}
