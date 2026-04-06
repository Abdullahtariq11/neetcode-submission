class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> currentSet=new ArrayList();
        List<List<Integer>> subsets= new ArrayList();
        int start=0;

        backtrack(nums,start,subsets,currentSet);
        return subsets;

    }
    public void backtrack(int [] nums, int start, List<List<Integer>> subsets, List<Integer> currentSet){
        subsets.add(new ArrayList(currentSet));
        for(int i=start; i<nums.length; i++){
            currentSet.add(nums[i]);
            backtrack(nums,i+1,subsets,currentSet);
            currentSet.remove(currentSet.size()-1);
        }
    }
}
