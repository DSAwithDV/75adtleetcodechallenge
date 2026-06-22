class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding =nums[0];
        int maxSum = nums[0];

        int minEnding = nums[0];
        int minSum = nums[0];




        for(int i=1;i<nums.length;i++){

           //pehle max enfding fir max sum
        maxEnding = Math.max(nums[i],maxEnding+nums[i]);
        maxSum = Math.max(maxSum,maxEnding);

          //pehle min enfding fir min sum
        minEnding = Math.min(nums[i],minEnding+nums[i]);
        minSum = Math.min(minSum,minEnding);


        }
        return Math.max(maxSum,Math.abs(minSum));
    }
}