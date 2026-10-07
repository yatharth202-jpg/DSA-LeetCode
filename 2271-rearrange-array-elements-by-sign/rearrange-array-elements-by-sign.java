class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // Result store karne ke liye array
        
        int posIndex = 0; // Positive elements ke liye even indices (0, 2, 4...)
        int negIndex = 1; // Negative elements ke liye odd indices (1, 3, 5...)
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[posIndex] = nums[i];
                posIndex += 2; // Agle even index par jaane ke liye
            } else {
                ans[negIndex] = nums[i];
                negIndex += 2; // Agle odd index par jaane ke liye
            }
        }
        
        return ans;
    }
}
