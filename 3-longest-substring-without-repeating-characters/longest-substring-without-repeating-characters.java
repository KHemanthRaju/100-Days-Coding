class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        int i=0,j=0,max=0;
        Set<Character> set = new HashSet<>();
        while(i<s.length()){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            max = Math.max(max, i-j+1);
            i++;
        }
        return max;
    }
}