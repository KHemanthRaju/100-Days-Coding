class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> se = new HashSet<>();
        int j = 0;
        int ans = 0;
        for(int i=0;i<s.length();i++){
            if(se.contains(s.charAt(i))){
                se.remove(s.charAt(j));
                j++;
            }
            se.add(s.charAt(i));
            ans = Math.max(ans, se.size());
        }
        return ans;
    }
}