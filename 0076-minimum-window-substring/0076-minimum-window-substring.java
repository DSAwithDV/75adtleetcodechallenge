class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return"";
        HashMap<Character,Integer> tCount = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for(char c: t.toCharArray()){
            tCount.put(c,tCount.getOrDefault(c,0)  + 1);
        }
        int have=0;
        int need = tCount.size();
        int minLen =Integer.MAX_VALUE;
        int start=0;
        int left =0;
        for(int right =0; right<s.length();right++){
            char c = s.charAt(right);//no uused toCharAray because it iss for convert not to assign
            window.put(c,window.getOrDefault(c,0)+1);

            if(tCount.containsKey(c) && window.get(c).intValue()==tCount.get(c).intValue()){
                have++;
            }
            while(have==need){
                if(right-left+1< minLen){
                    minLen=right-left+1;
                    start = left;

                }
                char ch = s.charAt(left);
                window.put(ch,window.get(ch)-1);

                if(tCount.containsKey(ch)&& window.get(ch)<tCount.get(ch)){
                    have--;
                }left++;
            }
        }
 return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
        
    }
}