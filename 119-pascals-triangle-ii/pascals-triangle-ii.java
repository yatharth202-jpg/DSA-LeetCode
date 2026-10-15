class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // Base case: the 0th row is just [1]
        row.add(1);
        
        // Iteratively build each row up to the target rowIndex
        for (int i = 1; i <= rowIndex; i++) {
            // Step 1: Add a 1 at the end of the current row
            row.add(1);
            
            // Step 2: Update the elements from right to left
            // We start from the element right before the last one down to index 1
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        
        return row;
    }
}