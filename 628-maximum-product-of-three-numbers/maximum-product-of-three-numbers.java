class Solution {
    public int maximumProduct(int[] nums) {
        // Sabse bade 3 numbers track karne ke liye
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        // Sabse chhote 2 numbers track karne ke liye (Negative values ke liye)
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        // Poore array ko ek baar check karenge
        for (int n : nums) {
            // Bade numbers ko update karne ka logic
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
            
            // Chhote (Negative) numbers ko update karne ka logic
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        
        // Dono possibilities mein se jo bada hoga, wahi answer hoga
        int option1 = max1 * max2 * max3; // Teeno sabse bade numbers ka product
        int option2 = min1 * min2 * max1; // 2 sabse chhote negative aur 1 sabse bada number
        
        return Math.max(option1, option2);
    }
}