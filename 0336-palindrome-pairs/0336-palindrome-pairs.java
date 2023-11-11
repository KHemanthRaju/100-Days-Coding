class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        if(words.length<2) return ans;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            String reverse= new StringBuilder(words[i]).reverse().toString();
            map.put(reverse,i);
        }
        System.out.println(map);
        for(int i=0;i<words.length;i++){
            for(int j=0;j<=words[i].length();j++){
                String s1 = words[i].substring(0,j);
                String s2 = words[i].substring(j);
                
                if(map.containsKey(s1) && isPalindrome(s2) && map.get(s1)!=i){
                    List<Integer> part1 = new ArrayList<>();
                    part1.add(i);
                    part1.add(map.get(s1));
                    ans.add(part1);
                }
                if(!s1.isEmpty() && map.containsKey(s2) && isPalindrome(s1) && map.get(s2)!=i){
                    List<Integer> part1 = new ArrayList<>();
                    part1.add(map.get(s2));
                    part1.add(i);
                    ans.add(part1);
                }
            }
        }
        return ans;
        
    }
    
    public boolean isPalindrome(String s){
        // System.out.println(s);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}