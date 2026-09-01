class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath= new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,result,currentPath);
        return result;
    }
}

public void backtrack(int start,int[] candidates,int remainingTarget,List<List<Integer>> result,List<Integer> currentPath){
    if(remainingTarget == 0){
        result.add(new ArrayList<>(currentPath));
        return;
    }
    if(remainingTarget < 0){
        return;
    }
    for(int i= start; i< candidates.length; i++){
         if (candidates[i] > remainingTarget) {
            break;
        }
        if (i > start && candidates[i] == candidates[i - 1]) {
            continue;
        }
        currentPath.add(candidates[i]);
        backtrack(i+1,candidates,remainingTarget-candidates[i],result,currentPath);
        currentPath.remove(currentPath.size()-1);
    }
}
