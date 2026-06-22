class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pos=0;
        int neg=1;
        for(int num:nums){//ek ek element pic ke liye
        if(num>0){// next neg ke lye space
            ans[pos] = num;
            pos+=2;

        }else{//next pos ke liye space
            ans[neg] = num;
            neg+=2;
        }


        }
        return ans;
    }
}