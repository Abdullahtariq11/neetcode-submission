class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for (int i=0;i<nums.length;i++){
          hashMap.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
          int comp=target-nums[i];
          if(hashMap.containsKey(comp) && hashMap.get(comp) != i){
            return new int[]{i,hashMap.get(comp)};
          }
        }
     return null;
    }
}
