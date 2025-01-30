class Solution {
    public int countGoodSubstrings(String s) {
        int max_count = 0;
        int i=0;
        HashSet<Character> set = new HashSet<>();

        for(int j=0;j<s.length();j++){
            
            while(set.contains(s.charAt(j)) ||j-i+1>3){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            
            if(j-i+1==3){
                max_count++;
            }
            

        }
        return max_count;
    }
}