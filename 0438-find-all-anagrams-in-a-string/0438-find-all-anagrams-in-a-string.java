class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if(p.length()>s.length()){
            return ans;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        //frequency of p
        for(char ch : p.toCharArray()){
           pCount [ch-'a']++;
        }
        int k = p.length();

        //for first window //indexing start 0,1,2,3,4,5
        for(int i=0;i<k;i++){
            sCount[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pCount,sCount)){//for store and strat indexing
        ans.add(0);}
      //sliding window now we finds k  size windows in s and add orremove
      for(int i =k;i<s.length();i++){
        sCount[s.charAt(i)-'a']++; //add
        sCount[s.charAt(i-k)-'a']--;//remove

        if(Arrays.equals(pCount,sCount)){
            ans.add(i-k+1);
        }


      }
      return ans;
        
    }
}