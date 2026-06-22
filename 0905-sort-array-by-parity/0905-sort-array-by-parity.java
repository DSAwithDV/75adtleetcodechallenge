class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] ans = new int[nums.length];

        int even = 0;
        int odd = nums.length - 1;

        for (int num : nums) {

            if (num % 2 == 0) {
                ans[even] = num;
                even++;
            } else {
                ans[odd] = num;
                odd--;//-- kyun ki piche se lageneg
            }
        }

        return ans;
    }
}