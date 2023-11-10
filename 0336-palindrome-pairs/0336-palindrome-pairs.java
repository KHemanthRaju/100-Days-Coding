class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; ++ i) map.put(words[i], i);
    for (int i = 0; i < words.length; ++ i) {
        int l = 0, r = 0;
        while (l <= r) {
            String s = words[i].substring(l, r);
            Integer j = map.get(new StringBuilder(s).reverse().toString());
            if (j != null && i != j && isPalindrome(words[i].substring(l == 0 ? r : 0, l == 0 ? words[i].length() : l)))
                ans.add(Arrays.asList(l == 0 ? new Integer[]{i, j} : new Integer[]{j, i}));
            if (r < words[i].length()) ++r;
            else ++l;
        }
    }
        return ans;
        
    }
    
    public boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}