class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            frequencyMap.put(nums[i],frequencyMap.getOrDefault(nums[i],0)+1);
        }
        List<int[]> pairs= new ArrayList<>();
        for(Integer key:frequencyMap.keySet()){
            pairs.add(new int[]{frequencyMap.get(key),key});
        }
        pairs.sort((a,b)->b[0]-a[0]);

        int [] res= new int[k];
        for(int i=0;i<k;i++){
            res[i]=pairs.get(i)[1];
        }
        return res;
    }
}
