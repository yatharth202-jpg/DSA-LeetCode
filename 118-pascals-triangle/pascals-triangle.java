class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        // Base case: if numRows is 0, return empty list
        if (numRows <= 0) return res;
        
        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);
        
        // Generate subsequent rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = res.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            
            // The first element of each row is always 1
            currRow.add(1);
            
            // Calculate the interior values using the previous row
            for (int j = 1; j < prevRow.size(); j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            // The last element of each row is always 1
            currRow.add(1);
            
            res.add(currRow);
        }
        
        return res;
    }
}