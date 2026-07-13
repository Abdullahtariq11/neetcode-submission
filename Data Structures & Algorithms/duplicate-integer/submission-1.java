class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.size()>0){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}