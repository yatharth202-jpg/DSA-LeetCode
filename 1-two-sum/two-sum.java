public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Create a 2D array to store pairs of [value, original_index]
        int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i][0] = nums[i];       // The element value
            numWithIndex[i][1] = i;             // The original index
        }
        
        // 2. Sort the 2D array based on the element values (ascending order)
        Arrays.sort(numWithIndex, Comparator.comparingInt(a -> a[0]));
        
        // 3. Initialize two pointers: one at the start, one at the end
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int currentSum = numWithIndex[left][0] + numWithIndex[right][0];
            
            if (currentSum == target) {
                // Found the pair, return their original indices
                return new int[] { numWithIndex[left][1], numWithIndex[right][1] };
            } else if (currentSum < target) {
                // Sum is too small, move the left pointer forward to get a larger value
                left++;
            } else {
                // Sum is too large, move the right pointer backward to get a smaller value
                right--;
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
}