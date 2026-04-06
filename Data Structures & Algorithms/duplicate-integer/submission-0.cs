public class Solution {
    public bool hasDuplicate(int[] nums) {
       if(nums.Length<2)
        return false;
        Dictionary<int,int> valueSet= new Dictionary<int,int>();
        for(int i=0; i<nums.Length;i++){
            if(valueSet.ContainsKey(nums[i]))
                return true;
            valueSet[nums[i]]=i;
        }
        return false;
    }
}