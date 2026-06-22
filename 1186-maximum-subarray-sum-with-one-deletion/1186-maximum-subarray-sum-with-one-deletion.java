class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = 0;
        int ans = arr[0];

        for(int i=1;i<arr.length;i++){
            //i=1 se starty because hm zero pe sab decalte kr chuke h 
            int prevNoDelete = noDelete;///savee krna  padega kyunkim max value chahiy nodelete ki
            noDelete = Math.max(arr[i],noDelete+arr[i]);
            oneDelete = Math.max(prevNoDelete,oneDelete+arr[i]);
            ans = Math.max(ans,Math.max(noDelete,oneDelete)); 
        }
        return ans;
    }
}