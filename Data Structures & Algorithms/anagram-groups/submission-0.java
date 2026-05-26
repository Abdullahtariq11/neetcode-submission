class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map= new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!map.containsKey(key)){
                List<String> groupList=new ArrayList<>();
                groupList.add(str);
                map.put(key, groupList);
            }
            else{
                map.get(key).add(str);
            }
        }
        List<List<String>> anagrams=map.values().stream().collect(Collectors.toList());
        return anagrams;

    }
}
