class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> seen= new HashMap<Integer,Integer>();

        for(int i =0; i<nums.length;i++){
           if(seen.containsKey(nums[i])){
            return true;
           }
           seen.put(nums[i],i);
        }
        return false;
        
    }
}