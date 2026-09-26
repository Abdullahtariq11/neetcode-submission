class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

         for (Integer num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
         }

         List<Integer>[] buckets = new List[nums.length + 1];
         for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int num = e.getKey();
            int freq = e.getValue();
             if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
         }
        int[] result = new int[k];
        int j = 0;

           // Start from highest frequency
        for (int i = buckets.length - 1; i >= 0 && j < k; i--) {

            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[j++] = num;

                    if (j == k) {
                        break;
                    }
                }
            }
        }

        return result;
         

    }
}
