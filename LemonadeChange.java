// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        int five = 0, ten = 0;
        for (int i : bills) {
            if (i == 5)
                five++;
            else if (i == 10) {
                five--;
                ten++;
            }
            else if (ten > 0) {
                ten--;
                five--;
            }
            else
                five -= 3;
            if (five < 0) return false;
        }
        return true;
        
    }
}
