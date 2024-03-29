class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0){
            return t.charAt(0);
        }
    
        HashMap<Character,Integer> map = new HashMap<>();
       
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }
        
        for(Character ch : map.keySet()){
            if(map.get(ch) < 0){
                return ch;
            }
        }
        
        return '!';
    }
}