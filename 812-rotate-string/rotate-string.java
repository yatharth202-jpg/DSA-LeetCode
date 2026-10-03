class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
       int n = s.length();
       s += s;

       for(int i = 0; i<n ; i++) {
        String temp = s.substring(i,i+n);
            if(temp.equals(goal)) {
                return true;
            }
       }
       return false;
    }
}