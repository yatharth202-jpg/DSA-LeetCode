class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Return empty string if input array is null or empty
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Iterate through each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            
            // Check this character against the rest of the strings
            for (int j = 1; j < strs.length; j++) {
                // If current string is shorter than index 'i' or character mismatches
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        return strs[0];
    }
}