class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> q= new HashMap<>();
        int l=0;
        int r=0;
        int maxString=0;
        for(char c: s.toCharArray()){
            if(q.containsKey(c)){
                l=Math.max(l,q.get(c)+1);
            }
            q.put(c,r);
            maxString=Math.max(maxString,(r-l)+1);
            r++;
        }
        return maxString;
    }
}
