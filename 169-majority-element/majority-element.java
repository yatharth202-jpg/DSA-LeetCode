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
            
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}