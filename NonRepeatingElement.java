// using XOR method
public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int result = 0;

        for (int num : arr) {
            result ^= num;  // XOR cancels out duplicate numbers
        }

        System.out.println("Non-repeating element is: " + result);
    }
}

// using hashMap
import java.util.*;

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 7, 5, 8};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Non-repeating elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}


// using LinkedHashMap
import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating element: " + entry.getKey());
                break;
            }
        }
    }
}
