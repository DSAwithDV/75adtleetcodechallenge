class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int  n  = temperatures.length; //make an arry of result ans
        int[]  ans = new int[n];
        Stack<Integer> st = new Stack<>();

        ///loop chalega right se
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = 0;

            }else{//indexes substract by gretaer
                ans[i] =st.peek()-i;
            }
             st.push(i);
        }

        return ans;
    }
}