class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix[0].length-1;

        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(target<=matrix[i][r]){
                    while (l <= r) { 
                        int mid = l + (r - l) / 2;
                        if (matrix[i][mid] == target) {
                            return true;
                        } else if (target > matrix[i][mid]) {
                            l = mid + 1; 
                        } else {
                            r = mid - 1; 
                        }
                    }
                return false;
                }
                else if(target<matrix[i][l]){
                    return false;
                }
                else{
                    break;
                }
            }
        }
        return false;
        
    }
}
