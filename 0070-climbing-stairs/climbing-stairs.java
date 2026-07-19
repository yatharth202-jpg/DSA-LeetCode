class Solution {
    public int climbStairs(int n) {
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; i++) {
            int next = t1 + t2;
            t1 = t2;
            t2 = next;
        }

        return t2;
    }
}