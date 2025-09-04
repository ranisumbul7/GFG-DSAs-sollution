import java.util.*;

public class FirstMissingPositiveLikeLast {
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // step 1: put only positives in set
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        // step 2: check from 1 onwards
        int i = 1;
        while (true) {
            if (!set.contains(i)) {
                return i; // jo pehla missing mile wahi answer
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println("First Missing Positive: " + firstMissingPositive(nums)); // 3
    }
}
