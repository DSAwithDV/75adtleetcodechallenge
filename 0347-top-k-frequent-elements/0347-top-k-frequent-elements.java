class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //frequency count
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //min heap and fot set the priority
        PriorityQueue<Integer>pq = new PriorityQueue<>(
        (a,b)->map.get(a) - map.get(b));

        //put every uniq number into heap
        for(int num : map.keySet()){
            pq.add(num);
        
        //sirf k most frequent element rkh
        if(pq.size() > k){
            pq.poll();

        }
    }

    //answe array
    int[]answer = new int[k];
        for(int i = 0;i < k;i++){
            answer[i] = pq.poll(); 
        }
        return answer;
    }
}