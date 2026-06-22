class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq = new int[26];
        int left =0;
        int maxfreq =0;
        int maxlen = 0;


        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch -'A']++;///this is for increse freq of chars
        
        maxfreq = Math.max(maxfreq,freq[ch-'A']);
        // jab tk window length is invalid any how then left ko age bahdao
        while((right-left+1)-maxfreq>k){
            freq[s.charAt(left)-'A']--;
            left++;

        }
        maxlen = Math.max(maxlen,right-left+1);
    }
    return maxlen;
    }
}