import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its corresponding index
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in the map, we found the pair
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Otherwise, store the current number and its index in the map
            numToIndex.put(nums[i], i);
        }
        
        // Return an empty array or throw an exception if no solution exists
        throw new IllegalArgumentException("No two sum solution");
    }
}
