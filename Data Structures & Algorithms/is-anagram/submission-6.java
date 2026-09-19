class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();

        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for(Character c : t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }
            else{
                return false;
            }
        }
        for(Integer val : map.values()){
            if(val!=0){
                return false;
            }
        }
        return true;

    }
}
