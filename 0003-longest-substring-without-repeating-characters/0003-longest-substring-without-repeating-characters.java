class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0) return 0;
        int i=0, j=0;
        int max= 0;
        Set<Character> hs = new HashSet();
        while(i<s.length()){
            char c = s.charAt(i);
            while(hs.contains(c)){
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(c);
            max = Math.max(max, i-j+1);
            i++;
        }
        return max;
    }
}