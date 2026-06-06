class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLength = 0;
        int maxFrequency = 0; 
        
        for (r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(c));
            if ((r - l + 1) - maxFrequency > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);   l++; }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        
        return maxLength;
    }
}
