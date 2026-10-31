class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> currentPath= new ArrayList<>();

        backtrack(nums,target,0,result,currentPath);
        return result;
    }

    public void backtrack(int[] nums, int remainingTarget,int start,List<List<Integer>> 
        result,List<Integer> currentPath){
            if(remainingTarget == 0){
                result.add(new ArrayList<>(currentPath));
                return ;
            }
            if (remainingTarget < 0) {
                return;
            }
            for(int i= start; i<nums.length ;i++){
                currentPath.add(nums[i]);
                backtrack(nums,remainingTarget-nums[i],i,result,currentPath);
                currentPath.remove(currentPath.size()-1);
            }
        }
}
