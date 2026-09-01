class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, currentPath, result);

        return result;
    }

    private static void backtrack(int[] nums, int start, List<Integer> currentPath, List<List<Integer>> result) {

        result.add(new ArrayList<>(currentPath));

        for(int i =start; i< nums.length ; i++){
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            currentPath.add(nums[i]);
            backtrack(nums, i + 1, currentPath, result);
            currentPath.remove(currentPath.size() - 1);
        }

                                  
    }
}
