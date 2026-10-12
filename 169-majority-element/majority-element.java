class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // Traditional for loop format
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; // Array se element nikalna

            if (count == 0) {
                candidate = num;
            }
            
            // 'number' ki jagah 'num' use hoga
            if (num == candidate) {
                count++; // count = count + 1;
            } else {
                count--; // count = count - 1;
            }
        }

        return candidate;
    }
}
