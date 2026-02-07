class Solution {
    public boolean searchMatrix(int[][] matrix, int tar) {

        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0;
        int hi = n - 1;

        int ansRow = -1;

        while(lo <= hi){
            int midRow = lo + (hi - lo)/2;
            if( matrix[midRow][0] <= tar && matrix[midRow][m-1] >= tar){
                ansRow = midRow;
                break;
            }else if(tar > matrix[midRow][m - 1]){
                lo = midRow + 1;
            }else{
                hi = midRow - 1;
            }
        }

        if(ansRow == -1){
            return false;
        }


        lo = 0;
        hi = m -1;

        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(matrix[ansRow][mid] == tar){
                return true;
            }else if(matrix[ansRow][mid] > tar){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }

        return false;


    }
}
