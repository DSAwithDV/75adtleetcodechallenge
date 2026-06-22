class Solution {
    public int maxTurbulenceSize(int[] arr) {
        //curr or max=1 se start hoga kyunki 1 lengtth array le skte h 
        int curr=1;
        int max=1;

        int prevComp=0;
        for(int i=1;i<arr.length;i++){
            int currComp=0;
            if(arr[i]>arr[i-1]){
                currComp=1;
            }
            else if(arr[i]<arr[i-1]){
                currComp=-1;
            } if(currComp==0){
                curr=1;
            }else if(currComp*prevComp==-1){
                curr++;
            }else{
                curr=2;//agr ye  currComp otr ptevComp equal mmhi h to 2 ho jayga 
            }
            max=Math.max(max,curr);
            prevComp=currComp;//kyu agle iteration me prev curr ke equal me ho jaynge
        }
        return max;
    }
}