class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] array1= new int [26];
        int [] array2= new int [26];

        if(s1.length()>s2.length()){
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }
        if(matches(array1,array2)){
            return true;
        }
        for (int i = s1.length();i<s2.length();i++){
            array2[s2.charAt(i) - 'a']++;
            array2[s2.charAt(i-s1.length()) - 'a']--;

            if(matches(array1,array2)){
            return true;
            }

        }
        return false;

    }

    private boolean matches(int[] s1Counts, int[] s2Counts) {
        for (int i = 0; i < 26; i++) {
            if (s1Counts[i] != s2Counts[i]) {
                return false;
            }
        }
        return true;
    }
}
