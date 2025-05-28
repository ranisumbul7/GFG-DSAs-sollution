class Solution {
    static int evenlyDivides(int n) {
        int temp = n, count = 0;
        while (temp != 0) {
            // extract the last digit
            int d = temp % 10;
            temp /= 10;

            // check if n divides d completely
            if (d > 0 && n % d == 0) count++;
        }

        return count;
    }
}
