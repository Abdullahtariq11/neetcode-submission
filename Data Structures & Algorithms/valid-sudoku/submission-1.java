class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i = 0; i<board[0].length; i++){
            for(int j = 0; j<board[1].length; j++){
                char num= board[i][j];

                if(num != '.'){
                    if(!seen.add(num+"r"+i) || !seen.add(num+"c"+j) 
                    || !seen.add(num+"box"+i/3+j/3) )
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
