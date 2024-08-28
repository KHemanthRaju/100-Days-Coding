class Solution {
    public int characterReplacement(String s, int k) {
        int windowStart = 0;
        int countletters = 0, max=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int windowEnd = 0;windowEnd<s.length();windowEnd++){
            char rightChar = s.charAt(windowEnd);
            hm.put(rightChar, hm.getOrDefault(rightChar,0)+1);
            countletters = Math.max(countletters, hm.get(rightChar));
            if(windowEnd-windowStart+1 - countletters>k){
                char leftChar = s.charAt(windowStart);
                hm.put(leftChar, hm.get(leftChar)-1);
                windowStart++;
            }
            max = Math.max(max, windowEnd-windowStart+1);
        }
        return max;
    }
}