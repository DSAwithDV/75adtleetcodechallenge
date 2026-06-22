class Solution {
    public void moveZeroes(int[] nums) {
        // intiallise j with zero i count for current element and j for swap to 0 if i =1 ,j=0 thna swap i j//
       int j = 0;
         for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){

            int temp = nums[i];
            nums [i] = nums[j];
            nums [j] =  temp;

         
         j++;
     }
        
    }
   }
  }
