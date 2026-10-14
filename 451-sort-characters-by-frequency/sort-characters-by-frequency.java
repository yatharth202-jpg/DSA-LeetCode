class Solution {
    public String frequencySort(String s) {
        // Step 1: Count the frequency of each character
        Map<Character, Integer> cnt = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            cnt.merge(s.charAt(i), 1, Integer::sum);
        }
        
        // Step 2: Get unique characters into a list
        List<Character> cs = new ArrayList<>(cnt.keySet());
        
        // Step 3: Sort characters in descending order of their frequency
        cs.sort((a, b) -> cnt.get(b) - cnt.get(a));
        
        // Step 4: Build the resulting string
        StringBuilder ans = new StringBuilder();
        for (char c : cs) {
            int freq = cnt.get(c);
            for (int v = 0; v < freq; v++) {
                ans.append(c);
            }
        }
        
        return ans.toString();
    }
}