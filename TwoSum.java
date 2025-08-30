import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // check if complement exists
            if (map.containsKey(target - num)) {
                return new int[] { map.get(target - num), i }; 
                // smaller index comes first
            }

            map.put(num, i);
        }

        return null; // no solution found
    }
}
