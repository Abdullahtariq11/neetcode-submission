class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        backtrack(nums,used,result,currentPath);

        return result;
    }
    public void backtrack(int [] nums, boolean[] used,
    List<List<Integer>> result,List<Integer> currentPath){
            if(currentPath.size() == nums.length){
                result.add(new ArrayList<>(currentPath));
                return;
            }

            for(int i =0; i<nums.length ; i++){
                if(used[i]){
                    continue;
                }
                used[i]= true;
                currentPath.add(nums[i]);
                backtrack(nums,used,result,currentPath);

                currentPath.remove(currentPath.size() - 1);
                used[i] = false;
            }
    }
}
