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
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))==0 || !map.containsKey(t.charAt(i))){
                return t.charAt(i);
            }else{
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }
        
        return '!';
    }
}