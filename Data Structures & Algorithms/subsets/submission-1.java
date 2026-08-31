class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        return Backtrack(nums,0,currentPath,result);
    }

    public List<List<Integer>> Backtrack(int [] nums, int start ,List<Integer> 
        currentPath,List<List<Integer>> result ){
            result.add(new ArrayList<>(currentPath));

            for(int i= start; i<nums.length; i++){
                currentPath.add(nums[i]);
                Backtrack(nums,i+1,currentPath,result);
                currentPath.remove(currentPath.size() - 1);
            }

        return result;
    }
}
