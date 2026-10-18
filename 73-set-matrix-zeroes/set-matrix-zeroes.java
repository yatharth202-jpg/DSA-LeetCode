class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int arr[][] = new int[n][m];

        for(int i=0 ; i<n ; i++) {
            for(int j =0; j<m ; j++) {
                if(matrix[i][j] == 0) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }

         for(int i=0 ; i<n ; i++) {
            for(int j =0; j<m ; j++) {
                if(arr[i][j] == 0) {
                   for(int k=0 ; k<n ; k++) {
                    for(int l =0; l<m ; l++) {
                        matrix[k][j] = 0;
                        matrix[i][l] = 0;
                    }
                   }
                }
            }
        }


    }
}