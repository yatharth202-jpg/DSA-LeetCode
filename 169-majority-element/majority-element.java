public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            // If count falls to 0, we pick the current number as the new candidate
            if (count == 0) {
                candidate = num;
            }
            
            // If the current number matches the candidate, increment count; otherwise decrement
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
