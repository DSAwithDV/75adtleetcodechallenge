class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum=nums[0];
        int maxEnding = nums[0];
        int maxSum=nums[0];
        int minEnding =nums[0];
        int minSum = nums[0];

        for(int i=1; i<nums.length;i++){
            totalSum += nums[i];


            //normal kadane 
            maxEnding = Math.max(nums[i],maxEnding+nums[i]);
            maxSum = Math.max(maxSum,maxEnding);

 //min kadane

            minEnding = Math.min(nums[i],minEnding+nums[i]);
            minSum = Math.min(minSum,minEnding);
        } // All elements negative
        if(maxSum<0){
            return maxSum;
        }

        int circularSum = totalSum-minSum;
        return Math.max(maxSum,circularSum);
        
    }
}