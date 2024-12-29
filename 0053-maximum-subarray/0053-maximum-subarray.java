class Solution {
    public int maxSubArray(int[] nums) {
        int currSum =0;
        int maxSum=nums[0];
        for(int num:nums){
            currSum=Math.max(currSum,0);
            currSum += num;
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}