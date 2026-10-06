class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveCount = 0;
        
        // Standard index-based for loop
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentConsecutiveCount++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveCount);
            } else {
                currentConsecutiveCount = 0;
            }
        }
        
        return maxConsecutiveOnes;
    }
}
