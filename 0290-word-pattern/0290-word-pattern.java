class Solution {
    public boolean wordPattern(String pattern, String s) {
        //2 HashMaps to check the frequency
        String[] words = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Boolean> map2 = new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            
            if(map1.containsKey(ch)==false){
                if(map2.containsKey(words[i])==true){
                    return false;
                }else{
                    map2.put(words[i],true);
                    map1.put(ch,words[i]);
                }
            }else{
                String ans = map1.get(ch);
                if(ans.equals(words[i])==false) return false;
            }
        }
        return true;
    }
}