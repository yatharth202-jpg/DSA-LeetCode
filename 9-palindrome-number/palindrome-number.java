class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0;
         if (x < 0) {
            return false;
        }
        int on = x;
        while (x > 0) {
            int digit = x % 10;
            rem = rem*10 + digit;
            x = x / 10;
            }

            if(on == rem) {
                return true;
            } else {
                return false;
            }
    }
}