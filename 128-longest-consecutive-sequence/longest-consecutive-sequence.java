class Solution {
    public int longestConsecutive(int[] numss) {
       Set<Integer> set = new HashSet<>();

        for(int i=0; i<numss.length ; i++) {
            set.add(numss[i]);
        }
            int ans = 0;
        for(int nums : set) {
            if(!set.contains(nums -1)) {
                int curr = nums;
                int len = 1;

                while(set.contains(curr +1)) {
                    curr++;
                    len++;
                }

             ans = Math.max(ans,len) ;
            }
        }
            return ans;
    }
}