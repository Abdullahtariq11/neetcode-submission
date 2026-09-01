class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder currentPath = new StringBuilder();
        backtrack(result, currentPath, 0, 0, n);
        return result;
    }

    public void backtrack(List<String> result, StringBuilder currentPath, 
                           int openCount, int closeCount, int n){
        if (currentPath.length() == 2 * n) {
            result.add(currentPath.toString());
            return;
        }

        if (openCount < n) {
            currentPath.append('(');                                          
            backtrack(result, currentPath, openCount + 1, closeCount, n);     
            currentPath.deleteCharAt(currentPath.length() - 1);               
        }


        if (closeCount < openCount) {
            currentPath.append(')');                                          
            backtrack(result, currentPath, openCount, closeCount + 1, n);     
            currentPath.deleteCharAt(currentPath.length() - 1);               
        }

    }
}
