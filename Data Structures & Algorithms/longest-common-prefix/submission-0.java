class Solution {
    public String longestCommonPrefix(String[] strs) {
        String candidate=strs[0];
        for(int i=1;i<strs.length;i++){
            String newCandidate="";
            for(int j=0;j<Math.min(candidate.length(),strs[i].length());j++){
                if(candidate.charAt(j)==strs[i].charAt(j)){
                    newCandidate+=candidate.charAt(j);
                }
                else{
                    break;
                }
            }
            candidate=newCandidate;
        }
        return candidate;
    }
}