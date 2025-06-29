import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String stream = "aabcbb";
        printFirstNonRepeating(stream);
    }

    public static void printFirstNonRepeating(String stream) {
        int[] freq = new int[26]; // To count frequency of each character
        Queue<Character> queue = new LinkedList<>();

        for (char ch : stream.toCharArray()) {
            freq[ch - 'a']++;  // Increase count
            queue.add(ch);     // Add to queue

            // Remove all repeating characters from queue front
            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            // Print result
            if (queue.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
    }
}
