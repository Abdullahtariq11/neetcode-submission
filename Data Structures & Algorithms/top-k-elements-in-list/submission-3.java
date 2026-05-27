class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap= new HashMap<>();
        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        List<int[]> pairs= new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
            pairs.add(new int[] {entry.getValue(), entry.getKey()});
        }
        pairs.sort((a,b)->b[0]-a[0]);
        int [] res= new int[k];
        for(int i=0;i<k;i++){
            res[i]=pairs.get(i)[1];
        }
        return res;
    }
}
