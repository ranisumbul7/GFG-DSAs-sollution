import java.util.Arrays;

class Solution {

    // Function to find the longest palindromic subsequence
    static int longestPalinSubseq(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();

        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    curr[j] = prev[j - 1] + 1;
                } else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }
            prev = Arrays.copyOf(curr, n + 1);
        }

        return curr[n];
    }

  
    static int minDeletions(String s) {
        int n = s.length();
        int lps = longestPalinSubseq(s);
        return n - lps;
    }

    
    public static void main(String[] args) {
        String s = "abcda";
        System.out.println("Minimum deletions = " + minDeletions(s)); // Output: 2
    }
}

