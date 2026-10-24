class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Map<Integer, Integer> doom = new HashMap<>();
        List<Integer> ll = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n ;i++) {
            if(doom.containsKey(nums[i])) {
                doom.put(nums[i],doom.get(nums[i] ) +1);
            } else {
                doom.put(nums[i],1);
            }
        }

        for(int key : doom.keySet()) {
            if(doom.get(key) > n/3) {
                ll.add(key);
            }
        }

        return ll;
    }
}