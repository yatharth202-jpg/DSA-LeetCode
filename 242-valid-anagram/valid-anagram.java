class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // 'a' se 'z' tak ke 26 letters ke counts ko store karne ke liye array
        int[] charCounts = new int[26];
        
        // Pehli string ke character par count badhao (+1) 
        // Aur dusri string ke character par count ghatao (-1)
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        
        // Array ke har index ko 0 se 25 tak check karenge
        // Agar dono strings exact anagram hain, toh saare counts 0 hone chahiye
        for (int i = 0; i < 26; i++) {
            if (charCounts[i] != 0) {
                // Agar kisi bhi letter ka count 0 nahi hai, toh false return karo
                return false; 
            }
        }
        
        // Agar saare letters ka count balanced (0) mila, toh true return karo
        return true;
    }
}
