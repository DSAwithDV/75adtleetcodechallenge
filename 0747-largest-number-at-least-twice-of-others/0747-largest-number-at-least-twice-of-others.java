class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
                maxIndex = i;
            }
            else if(nums[i]>secondLargest){
                secondLargest = nums[i];
            }
        } if (largest >= 2 * secondLargest) {
            return maxIndex;
        
    }
    return -1;
}
}