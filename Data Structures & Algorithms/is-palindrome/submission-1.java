class Solution {
    public boolean isPalindrome(String s) {
        char [] cArray= s.toLowerCase().toCharArray();
        int l= 0;
        int r= cArray.length-1;

        while(l<r){
           while (l < r && !Character.isLetterOrDigit(cArray[l])) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(cArray[r])) {
                r--;
            }
            if(cArray[l] != cArray[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
