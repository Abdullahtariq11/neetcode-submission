class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length-1;
        int sum=0;
        int maxSum=nums[0];
        for (int i=0; i<= n ; i++){
            sum= nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            for(int j=i+1; j<=n;j++){
                sum += nums[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
}
