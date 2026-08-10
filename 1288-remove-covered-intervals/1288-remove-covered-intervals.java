class Solution {
    public int removeCoveredIntervals(int[][] intervals) {

        // sabse pehle inhe satrt ascending me set and and end digit dscending me set
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0]){
                return b[1]-a[1];

            }return a[0]-b[0];
        });
        int count  = 1;
        int maxEnd = intervals[0][1];

        for(int i =1;i<intervals.length;i++){
            if(intervals[i][1] <= maxEnd){
                continue;//covered interval
            }
            else{
                count++;
                maxEnd = intervals[i][1];
            }

            
        }

        return count;
        
    }
}