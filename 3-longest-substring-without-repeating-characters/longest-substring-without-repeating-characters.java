class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int max_length=0;
        HashSet<Character> set = new HashSet<>();
        for(int j=0;j<s.length();j++){

            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i+=1;
            }

            set.add(s.charAt(j));

            max_length = Math.max(max_length,j-i+1);
        }
        return max_length;
    }
}