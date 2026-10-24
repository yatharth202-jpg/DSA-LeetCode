public class Solution {
    public int longestConsecutive(int[] nums) {
        // Handle empty array base case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 1: Add all numbers to a HashSet for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestSequence = 0;

        // Step 2: Iterate through each unique number to find sequences
        for (int num : numSet) {
            // Check if 'num' is the starting point of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;

                // Expand the sequence forward
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentSequence += 1;
                }

                // Update the maximum sequence found so far
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }

        return longestSequence;
    }
}